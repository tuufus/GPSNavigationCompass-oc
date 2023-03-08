package com.pyxis.compass.gpscompassnavigationmap.activity.weatherfull.forecast7day.interfaces;

import com.pyxis.compass.gpscompassnavigationmap.activity.weatherfull.hourtoday.modelhour.ForeCastHourModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiDarkSky {
    @GET("1aae2b9f1b158e81f3664a6a3ee883ac/")
    Call<ForeCastHourModel> getForeCastHour(String locationString, @Query("units") String units, @Query("exclude") String exclude);

    @GET("1aae2b9f1b158e81f3664a6a3ee883ac/{locationString}")
    Call<ForeCastHourModel> getForeCast11(@Path("locationString") String locationString, @Query("units") String units, @Query("exclude") String exclude);
}
