package com.interview.shortcut;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl {
    @Value(value = "${s001.version}")
    public String version;

    @Value(value = "${s001.max-product-image}")
    public int maxProductImage;

}
