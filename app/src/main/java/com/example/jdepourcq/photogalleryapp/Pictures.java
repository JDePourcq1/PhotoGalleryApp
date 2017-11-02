package com.example.jdepourcq.photogalleryapp;

/**
 * Created by JDePourcq on 2017-10-04.
 */



public class Pictures {
    public String location;
    public String description;
    public String date;
    public byte[] picture;
    private int id;

    public Pictures() {

    }

    public Pictures(String location, String description, String date, byte[] picture) {
        this.location = location;
        this.description = description;
        this.date = date;
        this.picture = picture;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setDescription(String description) {this.description = description;}

    public String getDescription() {return description;}

    public void setDate(String date) {this.date = date;}

    public String getDate() {return date;}

    public void setPicture(byte[] picture) {this.picture = picture;}

    public byte[] getPicture() {return picture;}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}




