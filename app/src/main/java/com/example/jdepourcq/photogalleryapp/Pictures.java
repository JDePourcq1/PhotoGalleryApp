package com.example.jdepourcq.photogalleryapp;

/**
 * Created by JDePourcq on 2017-10-04.
 */



public class Pictures {
    public String location;
    private int id;

    public Pictures() {

    }

    public Pictures(String location) {
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}




