package com.example.weatherApi_Cohort.utils;

/*
 * @author batuhanvural
 */

import com.example.weatherApi_Cohort.entity.WeatherApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
@Slf4j
public class WeatherApiStackClnt {
    private final RestTemplate restTemplate;
    private final WeatherApiStackCnfg weatherApiStackCnfg;

    public WeatherApiResponse getWeatherApiForecast(String city, String countryCode, String startDate, String endDate) {
        String requestUrl = new StringBuilder()
                .append(weatherApiStackCnfg.getBaseUrl())
                .append(city)
                .append(",")
                .append(countryCode)
                .append("/")
                .append(startDate)
                .append("/")
                .append(endDate)
                .append("?key=")
                .append(weatherApiStackCnfg.getApiKey())
                .toString();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> request = new HttpEntity<>(httpHeaders);

        try {
            ResponseEntity<WeatherApiResponse> response = restTemplate
                    .exchange(requestUrl, HttpMethod.GET, request, WeatherApiResponse.class);
            return response.getBody();
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }

    }
}
