package com.example.weatherapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class DailyForecast {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("list")
    @Expose
    private java.util.List<Day> list = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public java.util.List<Day> getList() {
        return list;
    }

    public void setList(java.util.List<Day> list) {
        this.list = list;
    }

}
class Clouds {

        @SerializedName("all")
        @Expose
        private Integer all;

        public Integer getAll() {
            return all;
        }

        public void setAll(Integer all) {
            this.all = all;
        }

    }
 class Coord {

        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lon")
        @Expose
        private Double lon;

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

    }

 class Day {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("coord")
        @Expose
        private Coord coord;
        @SerializedName("main")
        @Expose
        private Main main;
        @SerializedName("dt")
        @Expose
        private Integer dt;
        @SerializedName("wind")
        @Expose
        private Main.Weather.Wind wind;
        @SerializedName("sys")
        @Expose
        private Main.Sys sys;
        @SerializedName("rain")
        @Expose
        private Main.Rain rain;
        @SerializedName("snow")
        @Expose
        private Object snow;
        @SerializedName("clouds")
        @Expose
        private Clouds clouds;
        @SerializedName("weather")
        @Expose
        private java.util.List<Main.Weather> weather = null;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public Main getMain() {
            return main;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Main.Weather.Wind getWind() {
            return wind;
        }

        public void setWind(Main.Weather.Wind wind) {
            this.wind = wind;
        }

        public Main.Sys getSys() {
            return sys;
        }

        public void setSys(Main.Sys sys) {
            this.sys = sys;
        }

        public Main.Rain getRain() {
            return rain;
        }

        public void setRain(Main.Rain rain) {
            this.rain = rain;
        }

        public Object getSnow() {
            return snow;
        }

        public void setSnow(Object snow) {
            this.snow = snow;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        public java.util.List<Main.Weather> getWeather() {
            return weather;
        }

        public void setWeather(java.util.List<Main.Weather> weather) {
            this.weather = weather;
        }

    }
 class Main {

        @SerializedName("temp")
        @Expose
        private Double temp;
        @SerializedName("feels_like")
        @Expose
        private Double feelsLike;
        @SerializedName("temp_min")
        @Expose
        private Double tempMin;
        @SerializedName("temp_max")
        @Expose
        private Double tempMax;
        @SerializedName("pressure")
        @Expose
        private Integer pressure;
        @SerializedName("humidity")
        @Expose
        private Integer humidity;

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(Double feelsLike) {
            this.feelsLike = feelsLike;
        }

        public Double getTempMin() {
            return tempMin;
        }

        public void setTempMin(Double tempMin) {
            this.tempMin = tempMin;
        }

        public Double getTempMax() {
            return tempMax;
        }

        public void setTempMax(Double tempMax) {
            this.tempMax = tempMax;
        }

        public Integer getPressure() {
            return pressure;
        }

        public void setPressure(Integer pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

class Rain {

        @SerializedName("1h")
        @Expose
        private Double _1h;

        public Double get1h() {
            return _1h;
        }

        public void set1h(Double _1h) {
            this._1h = _1h;
        }

    }
 class Sys {

        @SerializedName("country")
        @Expose
        private String country;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

    }
 class Weather {

     @SerializedName("id")
     @Expose
     private Integer id;
     @SerializedName("main")
     @Expose
     private String main;
     @SerializedName("description")
     @Expose
     private String description;
     @SerializedName("icon")
     @Expose
     private String icon;

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getMain() {
         return main;
     }

     public void setMain(String main) {
         this.main = main;
     }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }

     public String getIcon() {
         return icon;
     }

     public void setIcon(String icon) {
         this.icon = icon;
     }

     class Wind {

         @SerializedName("speed")
         @Expose
         private Double speed;
         @SerializedName("deg")
         @Expose
         private Integer deg;

         public Double getSpeed() {
             return speed;
         }

         public void setSpeed(Double speed) {
             this.speed = speed;
         }

         public Integer getDeg() {
             return deg;
         }

         public void setDeg(Integer deg) {
             this.deg = deg;
         }

     }

 }
}