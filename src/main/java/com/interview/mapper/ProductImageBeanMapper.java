package com.interview.mapper;

import com.interview.bean.ProductImageBean;
import com.interview.bean.ProductImageBeanExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImageBeanMapper {
    int countByExample(ProductImageBeanExample example);

    int deleteByExample(ProductImageBeanExample example);

    int deleteByPrimaryKey(Integer pitId);

    int insert(ProductImageBean record);

    int insertSelective(ProductImageBean record);

    List<ProductImageBean> selectByExample(ProductImageBeanExample example);

    ProductImageBean selectByPrimaryKey(Integer pitId);

    int updateByExampleSelective(@Param("record") ProductImageBean record, @Param("example") ProductImageBeanExample example);

    int updateByExample(@Param("record") ProductImageBean record, @Param("example") ProductImageBeanExample example);

    int updateByPrimaryKeySelective(ProductImageBean record);

    int updateByPrimaryKey(ProductImageBean record);
}