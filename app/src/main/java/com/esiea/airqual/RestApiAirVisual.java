package com.esiea.airqual;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApiAirVisual {

    String BASEURL = "https://api.airvisual.com/v2/";
    String APIKEY = "xYLsavXgCimFG3ZMN";

    //api.airvisual.com/v2/countries?key=xYLsavXgCimFG3ZMN

    @GET("city?")
    Call<City> getCityInfo(@Query("city") String city, @Query("state") String state, @Query("country") String country, @Query("key") String apiKey);

    @GET("nearest_city?")
    Call<City> getNearestCity(@Query("key") String apiKey);

    @GET("states?")
    Call<StatesInCountry> getStatesInCountry(@Query("country") String country, @Query("key") String apiKey );

    @GET("cities?")
    Call<Cities> getCitiesInState(@Query("state") String state, @Query("country") String country, @Query("key") String apiKey);
}
