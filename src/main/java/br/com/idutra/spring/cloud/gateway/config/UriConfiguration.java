package br.com.idutra.spring.cloud.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Data
public class UriConfiguration {
    private String httpBin = "http://httpbin.org:80";
}
