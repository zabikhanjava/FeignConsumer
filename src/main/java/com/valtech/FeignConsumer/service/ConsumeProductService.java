package com.valtech.FeignConsumer.service;

import com.valtech.FeignConsumer.model.Products;
import feign.RequestLine;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ConsumeProductService {
    @RequestLine("GET /getListSoap")
    List<Products> findAll();
}
