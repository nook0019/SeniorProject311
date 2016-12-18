package com.seniorfinalpro.seniorproject311;

/**
 * Created by Pc100 on 17/12/2559.
 */

public class URL_connect {
    public static String forcast_weather = "http://api.openweathermap.org/data/2.5/forecast?";
    public static String latPathumWan = "13.7379579";
    public static String longPathumWan = "100.51679";
    public static String appId_for_weather = "da0c1c5824dc0ab5d4c66145da9a85ce";

    public static String path_forcast_weather = forcast_weather+"lat="+latPathumWan+"&lon="+longPathumWan+"&appid="+appId_for_weather;
}
