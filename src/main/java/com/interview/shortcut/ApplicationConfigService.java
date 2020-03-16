package com.interview.shortcut;

import com.interview.helper.ServiceHelper;
import com.interview.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ApplicationConfigService {
    @Autowired
    public ConfigServiceImpl configService;

    @Autowired
    public MapperServiceImpl mapperService;

    @Autowired
    public ServiceHelper serviceHelper;

    @Autowired
    public BCryptPasswordEncoder bcryptEncoder;

    @Autowired
    public UtilsServiceImpl utilsService;

    @Autowired
    public JWTServiceImpl jwtService;

    @Autowired
    public UserServiceImpl userService;

    @Autowired
    public CategoryServiceImpl categoryService;

    @Autowired
    public MerchantServiceImpl merchantService;

    @Autowired
    public ProductServiceImpl productService;
}
