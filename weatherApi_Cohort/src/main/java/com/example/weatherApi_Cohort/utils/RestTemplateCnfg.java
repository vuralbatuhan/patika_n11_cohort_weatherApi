package com.example.weatherApi_Cohort.utils;

/*
 * @author batuhanvural
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateCnfg {
    @Bean("weatherRestTemplate")
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }

}
