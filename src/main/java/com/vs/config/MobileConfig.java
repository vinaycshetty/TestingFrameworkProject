package com.vs.config;

/* 
    Created by : Vinay Shetty
    Date : 08-04-2025
*/

import lombok.Data;

@Data
public class MobileConfig {
    private String platformName;
    private String deviceName;
    private String appPackage;
    private String appActivity;
    private String udid;
    private String appPath;
    private String automationName;
}
