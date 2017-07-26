package com.mohali.farmersmarket.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by boss on 7/18/2017.
 */

public class Market {


    String facility_name;
    String street_name ;
    String borough;
    public LatLng getLatLng(){
       return new LatLng(latitude,longitude);
    }
    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public double getZip() {
        return zip;
    }

    public void setZip(double zip) {
        this.zip = zip;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    double zip ;
    double latitude;
    double longitude;
}
