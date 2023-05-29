package com.twinkles.ussd.service.config;


import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import static lombok.AccessLevel.PUBLIC;

@Configuration
@ConfigurationProperties(prefix = "decoded")
@Data
public class ApplicationConfiguration {

    private CacheConfigurationProperties cache;

    @Data
    public static class CacheConfigurationProperties {
        private Integer port;
        private String host;
        private String password;
        private String defaultTtl;
    }
}