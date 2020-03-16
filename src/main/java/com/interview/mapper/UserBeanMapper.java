package com.interview.mapper;

import com.interview.bean.UserBean;
import com.interview.bean.UserBeanExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBeanMapper {
    int countByExample(UserBeanExample example);

    int deleteByExample(UserBeanExample example);

    int deleteByPrimaryKey(Integer utId);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    List<UserBean> selectByExample(UserBeanExample example);

    UserBean selectByPrimaryKey(Integer utId);

    int updateByExampleSelective(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByExample(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);
}