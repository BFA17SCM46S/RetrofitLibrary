package com.example.retrofitlibrary2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {



    public static final String BASE_URL = "https://reqres.in/api/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
