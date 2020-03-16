package com.interview.service;

import com.interview.bean.CategoryBean;
import com.interview.bean.CategoryBeanExample;
import com.interview.bean.MerchantBean;
import com.interview.bean.MerchantBeanExample;
import com.interview.bean.system.RequestResult;
import com.interview.helper.RequestResultHelper;
import com.interview.shortcut.ApplicationConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl {
    @Autowired
    private ApplicationConfigService acs;

    public boolean isMerchantExist(int mtId) {
        MerchantBeanExample merchantBeanExample = new MerchantBeanExample();
        merchantBeanExample.createCriteria().andMtStatusEqualTo(1).andMtIdEqualTo(mtId);

        List<MerchantBean> merchantBeanList = acs.mapperService.merchantBeanMapper.selectByExample(merchantBeanExample);
        return merchantBeanList.size() == 0 ? false : true;
    }

    public RequestResult retrieveMerchant() {
        RequestResult requestResult;

        try {
            MerchantBeanExample merchantBeanExample = new MerchantBeanExample();
            merchantBeanExample.createCriteria().andMtStatusEqualTo(1);

            List<MerchantBean> merchantBeanList = acs.mapperService.merchantBeanMapper.selectByExample(merchantBeanExample);

            requestResult = RequestResultHelper.standardizeWithObject(merchantBeanList, "");
        } catch (Exception ex) {
            requestResult = RequestResultHelper.standardizeWithObject(null, ex.getMessage());
        }

        return requestResult;
    }

    public String getMerchantTitle(int mtId) {
        MerchantBean merchantBean = acs.mapperService.merchantBeanMapper.selectByPrimaryKey(mtId);
        return merchantBean.getMtTitle();
    }
}
