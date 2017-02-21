package com.example.roma.restfulaplication.model.callback;

import com.example.roma.restfulaplication.model.pojo.Flower;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FlowerService {

    @GET("/feeds/flowers.json")
    Call<List<Flower>> getAllFlowers();

}
