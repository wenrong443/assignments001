package com.interview.mapper;

import com.interview.bean.ProductBean;
import com.interview.bean.ProductBeanExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductBeanMapper {
    int countByExample(ProductBeanExample example);

    int deleteByExample(ProductBeanExample example);

    int deleteByPrimaryKey(Integer ptId);

    int insert(ProductBean record);

    int insertSelective(ProductBean record);

    List<ProductBean> selectByExampleWithBLOBs(ProductBeanExample example);

    List<ProductBean> selectByExample(ProductBeanExample example);

    ProductBean selectByPrimaryKey(Integer ptId);

    int updateByExampleSelective(@Param("record") ProductBean record, @Param("example") ProductBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductBean record, @Param("example") ProductBeanExample example);

    int updateByExample(@Param("record") ProductBean record, @Param("example") ProductBeanExample example);

    int updateByPrimaryKeySelective(ProductBean record);

    int updateByPrimaryKeyWithBLOBs(ProductBean record);

    int updateByPrimaryKey(ProductBean record);
}