package com.example.jdepourcq.photogalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }

    public void camera(View view) {
        //Camera.open();
    }

    public void search(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void picture(View view) {
        Intent intent = new Intent(this, PictureActivity.class);
        startActivity(intent);
    }
}
