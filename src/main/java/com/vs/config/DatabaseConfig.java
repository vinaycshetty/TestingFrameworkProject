package com.vs.config;

import lombok.Data;

/*
    Created by : Vinay Shetty
    Date : 08-04-2025
*/
@Data
public class DatabaseConfig {
    private String host;
    private int port;
    private String dbname;
    private String user;
    private String password;
}
