package com.vs.config;

import lombok.Data;

/*
    Created by : Vinay Shetty
    Date : 08-04-2025
*/
@Data
public class MinioConfig {
    private String endpoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
