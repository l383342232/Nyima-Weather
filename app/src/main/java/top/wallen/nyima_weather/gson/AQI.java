package top.wallen.nyima_weather.gson;

/**
 * Created by walle on 2/16/17.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
        
        public String qlty;

    }
}
