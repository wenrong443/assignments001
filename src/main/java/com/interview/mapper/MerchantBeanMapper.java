package com.interview.mapper;

import com.interview.bean.MerchantBean;
import com.interview.bean.MerchantBeanExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MerchantBeanMapper {
    int countByExample(MerchantBeanExample example);

    int deleteByExample(MerchantBeanExample example);

    int deleteByPrimaryKey(Integer mtId);

    int insert(MerchantBean record);

    int insertSelective(MerchantBean record);

    List<MerchantBean> selectByExample(MerchantBeanExample example);

    MerchantBean selectByPrimaryKey(Integer mtId);

    int updateByExampleSelective(@Param("record") MerchantBean record, @Param("example") MerchantBeanExample example);

    int updateByExample(@Param("record") MerchantBean record, @Param("example") MerchantBeanExample example);

    int updateByPrimaryKeySelective(MerchantBean record);

    int updateByPrimaryKey(MerchantBean record);
}