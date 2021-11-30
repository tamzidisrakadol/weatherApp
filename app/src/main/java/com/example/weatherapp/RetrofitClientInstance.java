package com.example.weatherapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    public static final String Base_Url ="https://api.openweathermap.org/";
    public static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){
        retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
     return retrofit;
    }

}
