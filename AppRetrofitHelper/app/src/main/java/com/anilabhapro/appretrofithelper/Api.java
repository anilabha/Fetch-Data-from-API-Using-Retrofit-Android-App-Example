package com.anilabhapro.appretrofithelper;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";
   // String BASE_URL = "https://raw.githubusercontent.com/anilabha/Fetch-Data-from-API-Using-Retrofit-Android-App-Example/main/marvel.json";

    /**
     * The return type is important here
     * The class structure that you've defined in Call<T>
     * should exactly match with your json response
     * If you are not using another api, and using the same as mine
     * then no need to worry, but if you have your own API, make sure
     * you change the return type appropriately
     **/
    @GET("marvel")
    Call<List<Hero>> getHeroes();

}
