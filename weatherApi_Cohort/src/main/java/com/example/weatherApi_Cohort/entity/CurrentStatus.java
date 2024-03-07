package com.example.weatherApi_Cohort.entity;

/*
 * @author batuhanvural
 */

import lombok.Data;

import java.util.List;

@Data
public class CurrentStatus {

    private String datetime;
    private int datetimeEpoch;
    private double temp;
    private double feelslike;
    private double humidity;
    private double dew;
    private double precip;
    private double precipprob;
    private double snow;
    private double snowdepth;
    private List<String> preciptype;
    private double windgust;
    private double windspeed;
    private double winddir;
    private double pressure;
    private double visibility;
    private double cloudcover;
    private double solarradiation;
    private double solarenergy;
    private double uvindex;
    private String conditions;
    private String icon;
    private List<String> stations;
    private String source;
    private String sunrise;
    private int sunriseEpoch;
    private String sunset;
    private int sunsetEpoch;
    private double moonphase;

}

