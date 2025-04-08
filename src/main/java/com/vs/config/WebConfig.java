package com.vs.config;

import lombok.Data;

/*
    Created by : Vinay Shetty
    Date : 08-04-2025
*/
@Data
public class WebConfig {
    private String browser;
    private boolean headless;
    private String baseUrl;
    private int timeout;
}
