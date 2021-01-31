package com.example.multistore;

import org.springframework.content.s3.config.EnableS3Stores;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableS3Stores("com.example.multistore")
@Configuration
public class S3StorageConfig {

    @Bean
    public String testStringBean() {
        return "";
    }
}
