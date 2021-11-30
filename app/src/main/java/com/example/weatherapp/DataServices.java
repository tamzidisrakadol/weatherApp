package com.example.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataServices {
    //end url= data/2.5/find?lat=55.5&lon=37.5&cnt=10&appid=7b5493e501514beac6a1c63af259bb83

    @GET("data/2.5/find")
    Call<DailyForecast> getDailyForecast(@Query("lat") double latitude,@Query("lon") double longitude,@Query("cnt") int cnt, @Query("appid") String apikey );

}
