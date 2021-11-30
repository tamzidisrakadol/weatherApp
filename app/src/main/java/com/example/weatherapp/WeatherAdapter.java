package com.example.weatherapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.MyViewHolder> {
    Context context;
    List<Day> days;


    public WeatherAdapter(Context context, List<Day> days) {
        this.context = context;
        this.days = days;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.weather,parent,false);
        MyViewHolder myViewHolder= new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       // days.get(position).getDt();
        // how to get date from api then convert to actual Date format
        Date date = new Date((long)(days.get(position).getDt())*1000);
        String dates = DateFormat.getDateTimeInstance().format(date);
        holder.date.setText(dates);
        holder.sky.setText(days.get(position).getWeather().get(0).getDescription()+"");
        holder.wind.setText(days.get(position).getWind().getSpeed().toString()+"");
        holder.humidity.setText(days.get(position).getMain().getHumidity().toString()+"");
        holder.pressure.setText(days.get(position).getMain().getPressure().toString()+"");
        holder.tempMax.setText(days.get(position).getMain().getTempMax().toString());
        holder.tempLow.setText(days.get(position).getMain().getTempMin().toString());
    }

    @Override
    public int getItemCount() {
        return days.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView date,sky,wind,pressure,humidity,tempMax,tempLow;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
           date= itemView.findViewById(R.id.daysTextView);
           sky=itemView.findViewById(R.id.skyTextView);
           wind=itemView.findViewById(R.id.windTextView);
           pressure= itemView.findViewById(R.id.pressureTextView);
           humidity= itemView.findViewById(R.id.humidityTextView);
           tempMax= itemView.findViewById(R.id.highTempTextView);
           tempLow=itemView.findViewById(R.id.lowTempTextView);
        }
    }
}
