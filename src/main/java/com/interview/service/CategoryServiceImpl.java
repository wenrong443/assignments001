package com.interview.service;

import com.interview.bean.CategoryBean;
import com.interview.bean.CategoryBeanExample;
import com.interview.bean.ProductBean;
import com.interview.bean.system.RequestResult;
import com.interview.helper.RequestResultHelper;
import com.interview.shortcut.ApplicationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl {
    @Autowired
    private ApplicationConfigService acs;

    public boolean isCategoryExist(int ctId){
        CategoryBeanExample categoryBeanExample = new CategoryBeanExample();
        categoryBeanExample.createCriteria().andCtStatusEqualTo(1).andCtIdEqualTo(ctId);

        List<CategoryBean> categoryBeanList = acs.mapperService.categoryBeanMapper.selectByExample(categoryBeanExample);
        return categoryBeanList.size() == 0 ? false : true;
    }

    public RequestResult retrieveCategory() {
        RequestResult requestResult;

        try{
            CategoryBeanExample categoryBeanExample = new CategoryBeanExample();
            categoryBeanExample.createCriteria().andCtStatusEqualTo(1);

            List<CategoryBean> categoryBeanList = acs.mapperService.categoryBeanMapper.selectByExample(categoryBeanExample);

            requestResult = RequestResultHelper.standardizeWithObject(categoryBeanList, "");
        }catch (Exception ex){
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public String getCategoryTitle(int ctId, String title){

        if (ctId != 0){
            CategoryBean categoryBean = acs.mapperService.categoryBeanMapper.selectByPrimaryKey(ctId);

            if (title.equals("")){
                title = categoryBean.getCtTitle();
            }else{
                title = categoryBean.getCtTitle() + " > " +  title;
            }

            return getCategoryTitle(categoryBean.getCtParentCtId(), title);
        }else {
            return title;
        }
    }
}
