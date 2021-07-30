package com.example.timesnewsapp;

import com.example.timesnewsapp.Articles;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    Call<Articles.NewsModal>getAllNews(@Url String url);
    @GET
    Call<Articles.NewsModal>getNewsByCategory(@Url String url);




}
