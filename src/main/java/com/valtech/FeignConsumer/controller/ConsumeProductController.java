package com.valtech.FeignConsumer.controller;

import com.valtech.FeignConsumer.model.Products;
import com.valtech.FeignConsumer.service.ConsumeProductService;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumeProductController {
    @Autowired
    ConsumeProductService consumeProductService;

    @GetMapping("/getProducts")
    public List<Products> getProducts() {

        return consumeProductService.findAll();
    }
}
