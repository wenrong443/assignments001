package com.interview.shortcut;

import com.interview.bean.MerchantBean;
import com.interview.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl {

    @Autowired
    public JWTBeanMapper jwtBeanMapper;

    @Autowired
    public RoleBeanMapper roleBeanMapper;

    @Autowired
    public UserBeanMapper userBeanMapper;

    @Autowired
    public CategoryBeanMapper categoryBeanMapper;

    @Autowired
    public ProductBeanMapper productBeanMapper;

    @Autowired
    public ProductImageBeanMapper productImageBeanMapper;

    @Autowired
    public MerchantBeanMapper merchantBeanMapper;

}
