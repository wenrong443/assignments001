package com.interview.mapper;

import com.interview.bean.JWTBean;
import com.interview.bean.JWTBeanExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JWTBeanMapper {
    int countByExample(JWTBeanExample example);

    int deleteByExample(JWTBeanExample example);

    int deleteByPrimaryKey(Integer jtId);

    int insert(JWTBean record);

    int insertSelective(JWTBean record);

    List<JWTBean> selectByExample(JWTBeanExample example);

    JWTBean selectByPrimaryKey(Integer jtId);

    int updateByExampleSelective(@Param("record") JWTBean record, @Param("example") JWTBeanExample example);

    int updateByExample(@Param("record") JWTBean record, @Param("example") JWTBeanExample example);

    int updateByPrimaryKeySelective(JWTBean record);

    int updateByPrimaryKey(JWTBean record);
}