package com.valtech.FeignConsumer.config;

import com.valtech.FeignConsumer.service.ConsumeProductService;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BiulderConfig {

    @Bean
    public ConsumeProductService getBuilderConfig()
    {
        return Feign.builder()
            .client(new OkHttpClient())
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .logger(new Slf4jLogger(ConsumeProductService.class))
            .logLevel(Logger.Level.FULL)
            .target(ConsumeProductService.class, "http://localhost:9090");
    }
}
