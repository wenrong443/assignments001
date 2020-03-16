package com.interview.mapper;

import com.interview.bean.CategoryBean;
import com.interview.bean.CategoryBeanExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryBeanMapper {
    int countByExample(CategoryBeanExample example);

    int deleteByExample(CategoryBeanExample example);

    int deleteByPrimaryKey(Integer ctId);

    int insert(CategoryBean record);

    int insertSelective(CategoryBean record);

    List<CategoryBean> selectByExample(CategoryBeanExample example);

    CategoryBean selectByPrimaryKey(Integer ctId);

    int updateByExampleSelective(@Param("record") CategoryBean record, @Param("example") CategoryBeanExample example);

    int updateByExample(@Param("record") CategoryBean record, @Param("example") CategoryBeanExample example);

    int updateByPrimaryKeySelective(CategoryBean record);

    int updateByPrimaryKey(CategoryBean record);
}