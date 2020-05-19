package com.zpc.microservice.service;

import com.zpc.microservice.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {

    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

    public Item queryItemById(Long id) {
        return this.restTemplate.getForObject("http://127.0.0.1:8081/item/"
                + id, Item.class);
    }
}
