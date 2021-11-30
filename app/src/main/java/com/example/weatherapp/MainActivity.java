package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        DataServices dataServices=retrofit.create(DataServices.class);
        Call<DailyForecast> call = dataServices.getDailyForecast(55.5,37.5,10,"7b5493e501514beac6a1c63af259bb83");

        call.enqueue(new Callback<DailyForecast>() {
            @Override
            public void onResponse(Call<DailyForecast> call, Response<DailyForecast> response) {
                if (response.isSuccessful()){
                   // Toast.makeText(MainActivity.this, response.body().getCod().toString() +" "+ response.body().getMessage().toString(), Toast.LENGTH_SHORT).show();
                    DailyForecast dailyForecast= response.body();
                    List<Day> days = dailyForecast.getList();
                    WeatherAdapter weatherAdapter = new WeatherAdapter(MainActivity.this,days);
                    recyclerView.setAdapter(weatherAdapter);
                    LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(MainActivity.this);
                    linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    recyclerView.setLayoutManager(linearLayoutManager);


                }else{
                    Toast.makeText(MainActivity.this, "something wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<DailyForecast> call, Throwable t) {
                Toast.makeText(MainActivity.this, "failed" + t, Toast.LENGTH_SHORT).show();

            }
        });
    }
}