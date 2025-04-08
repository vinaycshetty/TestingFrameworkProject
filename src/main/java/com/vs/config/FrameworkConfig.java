package com.vs.config;

/* 
    Created by : Vinay Shetty
    Date : 08-04-2025
*/

import lombok.Data;

@Data
public class FrameworkConfig {
    private String testType;
    private String environment;
    private WebConfig web;
    private MobileConfig mobile;
    private ApiConfig api;
    private DatabaseConfig database;
    private MinioConfig minio;
}
