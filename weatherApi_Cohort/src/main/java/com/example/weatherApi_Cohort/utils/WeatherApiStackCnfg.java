package com.example.weatherApi_Cohort.utils;

/*
 * @author batuhanvural
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "weather-api")
@Data
@Component
public class WeatherApiStackCnfg {
    private String baseUrl;
    private String apiKey;
}
