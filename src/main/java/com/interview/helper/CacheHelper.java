package com.interview.helper;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CacheHelper {
    public Cache<String, String> cache = Caffeine.newBuilder()
            .expireAfterWrite(180, TimeUnit.MINUTES)
            .maximumSize(2000)
            .build();

    public void clearCache(String id){
        cache.invalidate(id);
    }

    public String storeCache(String id, String phone_email) {
        cache.put(id, phone_email);
        return phone_email;
    }

    public String getCache(String id) {
        String dataObject = cache.get(id, u->null);
        return dataObject;
    }
}
