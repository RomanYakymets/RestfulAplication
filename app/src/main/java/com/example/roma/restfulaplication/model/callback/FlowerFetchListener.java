package com.example.roma.restfulaplication.model.callback;

import com.example.roma.restfulaplication.model.pojo.Flower;

import java.util.List;


public interface FlowerFetchListener  {

    void onDeliverAllFlowers(List<Flower> flowers);

    void onDeliverFlower(Flower flower);

    void onHideDialog();
}
