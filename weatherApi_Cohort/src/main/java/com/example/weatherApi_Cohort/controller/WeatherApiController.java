package com.example.weatherApi_Cohort.controller;

/*
 * @author batuhanvural
 */

import com.example.weatherApi_Cohort.entity.WeatherApiResponse;
import com.example.weatherApi_Cohort.utils.WeatherApiStackClnt;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/weatherApi")
@RequiredArgsConstructor
public class WeatherApiController {

    private final WeatherApiStackClnt weatherApiStackClnt;

    @GetMapping("{city}/{countryCode}/{startDate}/{endDate}")
    public ResponseEntity<WeatherApiResponse> getWeatherApi(@PathVariable String city,
                                                            @PathVariable String countryCode,
                                                            @PathVariable String startDate,
                                                            @PathVariable String endDate) {
        return ResponseEntity.ok(weatherApiStackClnt.getWeatherApiForecast(city,countryCode,startDate,endDate));
    }
}