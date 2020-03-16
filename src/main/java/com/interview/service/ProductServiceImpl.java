package com.interview.service;

import com.google.common.base.Preconditions;
import com.interview.bean.ProductBean;
import com.interview.bean.ProductBeanExample;
import com.interview.bean.ProductImageBean;
import com.interview.bean.ProductImageBeanExample;
import com.interview.bean.system.RequestResult;
import com.interview.helper.ControllerHelper;
import com.interview.helper.RequestResultHelper;
import com.interview.helper.ServiceHelper;
import com.interview.shortcut.ApplicationConfigService;
import com.interview.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl {
    @Autowired
    private ApplicationConfigService acs;

    public RequestResult addProduct(ProductBean productBean) {
        RequestResult requestResult;

        try {
            Preconditions.checkArgument(productBean.getPtMtId() != null, ErrorCode.MERCHANT_ID_IS_EMPTY);
            Preconditions.checkArgument(productBean.getPtCtId() != null, ErrorCode.CATEGORY_ID_IS_EMPTY);
            Preconditions.checkArgument(acs.merchantService.isMerchantExist(productBean.getPtMtId()), ErrorCode.INVALID_MERCHANT);
            Preconditions.checkArgument(acs.categoryService.isCategoryExist(productBean.getPtCtId()), ErrorCode.INVALID_CATEGORY);
            Preconditions.checkArgument(!productBean.getPtTitle().isEmpty(), ErrorCode.TITLE_IS_EMPTY);
            Preconditions.checkArgument(!productBean.getPtUrl().isEmpty(), ErrorCode.URL_IS_EMPTY);
            Preconditions.checkArgument(productBean.getPtPrice() != null, ErrorCode.PRICE_IS_EMPTY_OR_NEGATIVE);
            Preconditions.checkArgument(productBean.getPtPrice() > 0, ErrorCode.PRICE_IS_EMPTY_OR_NEGATIVE);
            Preconditions.checkArgument(productBean.getPtStatus() != null, ErrorCode.STATUS_IS_EMPTY);
            Preconditions.checkArgument(productBean.getPtStatus() == 0 || productBean.getPtStatus() == 1, ErrorCode.STATUS_IS_EMPTY);
            Preconditions.checkArgument(!productBean.getPtDescription().isEmpty(), ErrorCode.DESCRIPTION_IS_EMPTY);

            productBean.setPtParam1(productBean.getPtTitle().toLowerCase());
            int affectedRow = acs.mapperService.productBeanMapper.insert(productBean);

            Preconditions.checkArgument(affectedRow != 0, ErrorCode.FAILED_TO_INSERT);

            requestResult = RequestResultHelper.standardizeWithObject("SUCCESS", "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public RequestResult editProduct(ProductBean productBean) {
        RequestResult requestResult;

        try {
            ProductBeanExample productBeanExample = new ProductBeanExample();
            productBeanExample.createCriteria().andPtStatusEqualTo(1).andPtIdEqualTo(productBean.getPtId());

            List<ProductBean> productBeanList = acs.mapperService.productBeanMapper.selectByExampleWithBLOBs(productBeanExample);
            Preconditions.checkArgument(productBeanList.size() != 0, ErrorCode.PRODUCT_NOT_FOUND);

            if (productBean.getPtMtId() != null) {
                Preconditions.checkArgument(acs.merchantService.isMerchantExist(productBean.getPtMtId()), ErrorCode.INVALID_MERCHANT);
            }

            if (productBean.getPtCtId() != null) {
                Preconditions.checkArgument(acs.categoryService.isCategoryExist(productBean.getPtCtId()), ErrorCode.INVALID_CATEGORY);
            }

            if (productBean.getPtPrice() != null) {
                Preconditions.checkArgument(productBean.getPtPrice() > 0, ErrorCode.PRICE_IS_EMPTY_OR_NEGATIVE);
            }

            if (productBean.getPtStatus() != null) {
                Preconditions.checkArgument(productBean.getPtStatus() == 0 || productBean.getPtStatus() == 1, ErrorCode.STATUS_IS_EMPTY);
            }


            int affectedRow = acs.mapperService.productBeanMapper.updateByPrimaryKeySelective(productBean);

            Preconditions.checkArgument(affectedRow != 0, ErrorCode.FAILED_TO_UPDATE);

            requestResult = RequestResultHelper.standardizeWithObject("SUCCESS", "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public RequestResult removeProduct(List<Integer> ptIdList) {
        RequestResult requestResult;

        try {
            ProductBeanExample productBeanExample = new ProductBeanExample();
            productBeanExample.createCriteria().andPtStatusEqualTo(1).andPtIdIn(ptIdList);

            acs.mapperService.productBeanMapper.deleteByExample(productBeanExample);

            requestResult = RequestResultHelper.standardizeWithObject("SUCCESS", "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public RequestResult retrieveProduct(int ptId) {
        RequestResult requestResult;

        try {
            ProductBeanExample productBeanExample = new ProductBeanExample();
            productBeanExample.createCriteria().andPtStatusEqualTo(1).andPtIdEqualTo(ptId);

            List<ProductBean> productBeanList = acs.mapperService.productBeanMapper.selectByExampleWithBLOBs(productBeanExample);
            Preconditions.checkArgument(productBeanList.size() != 0, ErrorCode.PRODUCT_NOT_FOUND);

            ProductBean productBean = productBeanList.get(0);
            productBean.setPtCtIdDesc(acs.categoryService.getCategoryTitle(productBean.getPtCtId(), ""));
            productBean.setPtMtIdDesc(acs.merchantService.getMerchantTitle(productBean.getPtMtId()));
            productBean.setProductImageBeanList(retrieveProductImageByPtId(productBean.getPtId()));

            requestResult = RequestResultHelper.standardizeWithObject(productBean, "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public RequestResult searchProduct(String keyword) {
        RequestResult requestResult;

        try {
            ProductBeanExample productBeanExample = new ProductBeanExample();
            productBeanExample.createCriteria().andPtStatusEqualTo(1).andPtParam1Like("%" + keyword.toLowerCase() + "%");

            List<ProductBean> productBeanList = acs.mapperService.productBeanMapper.selectByExampleWithBLOBs(productBeanExample);
            Preconditions.checkArgument(productBeanList.size() != 0, ErrorCode.PRODUCT_NOT_FOUND);

            productBeanList.forEach(productBean -> {
                productBean.setPtCtIdDesc(acs.categoryService.getCategoryTitle(productBean.getPtCtId(), ""));
                productBean.setPtMtIdDesc(acs.merchantService.getMerchantTitle(productBean.getPtMtId()));
                productBean.setProductImageBeanList(retrieveProductImageByPtId(productBean.getPtId()));
            });

            requestResult = RequestResultHelper.standardizeWithObject(productBeanList, "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public List<ProductImageBean> retrieveProductImageByPtId(int ptId){
        ProductImageBeanExample productImageBeanExample = new ProductImageBeanExample();
        productImageBeanExample.createCriteria().andPitStatusEqualTo(1).andPitPtIdEqualTo(ptId);

        List<ProductImageBean> productImageBeanList = acs.mapperService.productImageBeanMapper.selectByExample(productImageBeanExample);
        return productImageBeanList;
    }

    public RequestResult addProductImage(int ptId, String imageURL) {
        RequestResult requestResult;

        try {
            ProductBeanExample productBeanExample = new ProductBeanExample();
            productBeanExample.createCriteria().andPtStatusEqualTo(1).andPtIdEqualTo(ptId);

            List<ProductBean> productBeanList = acs.mapperService.productBeanMapper.selectByExampleWithBLOBs(productBeanExample);
            Preconditions.checkArgument(productBeanList.size() != 0, ErrorCode.PRODUCT_NOT_FOUND);

            ProductImageBeanExample productImageBeanExample = new ProductImageBeanExample();
            productImageBeanExample.createCriteria().andPitStatusEqualTo(1).andPitPtIdEqualTo(ptId);

            List<ProductImageBean> productImageBeanList = acs.mapperService.productImageBeanMapper.selectByExample(productImageBeanExample);

            if (productImageBeanList.size() >= acs.configService.maxProductImage){
                throw new Exception(ErrorCode.MAX_4_IMAGES_PER_PRODUCT);
            }

            ProductImageBean productImageBean = new ProductImageBean();
            productImageBean.setPitStatus(1);
            productImageBean.setPitPtId(ptId);
            productImageBean.setPitPath(imageURL);

            int affectedRow = acs.mapperService.productImageBeanMapper.insert(productImageBean);

            Preconditions.checkArgument(affectedRow != 0, ErrorCode.FAILED_TO_INSERT);

            requestResult = RequestResultHelper.standardizeWithObject("SUCCESS", "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public RequestResult removeProductImage(List<Integer> pitIdList) {
        RequestResult requestResult;

        try {
            ProductImageBeanExample productImageBeanExample = new ProductImageBeanExample();
            productImageBeanExample.createCriteria().andPitStatusEqualTo(1).andPitIdIn(pitIdList);

            acs.mapperService.productImageBeanMapper.deleteByExample(productImageBeanExample);

            requestResult = RequestResultHelper.standardizeWithObject("SUCCESS", "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }
}
