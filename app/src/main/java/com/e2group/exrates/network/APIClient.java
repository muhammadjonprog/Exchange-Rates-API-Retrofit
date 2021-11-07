package com.e2group.exrates.network;

import retrofit2.Retrofit;

public class APIClient {

    private static Retrofit retrofit;

    private static final String BASE_URL = "xml";
    public static Retrofit getRetrofit{
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory()
                    .build();
        }
        return retrofit;

    }
}
