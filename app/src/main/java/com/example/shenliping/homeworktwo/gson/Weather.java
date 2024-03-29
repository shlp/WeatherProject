package com.example.shenliping.homeworktwo.gson;

/**
 * Created by shenliping on 2018/12/18.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
