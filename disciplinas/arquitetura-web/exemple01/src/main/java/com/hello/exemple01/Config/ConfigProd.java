package com.hello.exemple01.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class ConfigProd implements CommandLineRunner {

    @Value("${spring.application.name}")
    private String appName;

    @Bean(name = "appName")
    public String getAppName() {
        return this.appName;
    }

    @Bean(name = "appVersion")
    public String getAppVersion() {
        return "v1.1.0";
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("RUN PRODUCTION APPLICATION...");
    }

}
