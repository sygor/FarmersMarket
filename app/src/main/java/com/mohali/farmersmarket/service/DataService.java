package com.mohali.farmersmarket.service;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.mohali.farmersmarket.model.GsonRequest;
import com.mohali.farmersmarket.model.Market;

import java.util.List;

/**
 * Created by boss on 7/18/2017.
 */

public class DataService {
    public List<Market> getMarketData(){
        String url = "https://data.cityofnewyork.us/resource/cw3p-q2v6.json";
        GsonRequest gsonRequest = new GsonRequest(url, Market[].class, null, new Response.Listener() {
            @Override
            public void onResponse(Object response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        return null;
    }
}
