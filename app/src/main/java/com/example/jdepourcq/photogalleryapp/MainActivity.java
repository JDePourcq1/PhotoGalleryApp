package com.example.jdepourcq.photogalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*List<Pictures> pictures = db.getAllShops();

        for (Pictures picture : pictures) {
            String log = "Id: " + picture.getId() + " ,Location: " + picture.getLocation();
            // Writing shops to log
            Log.d("Picture: : ", log);
        }*/
    }

    public void logIn(View view) {
        Intent intent = new Intent(this, GalleryActivity.class);
        intent.putExtra("location", "start");
        startActivity(intent);
    }

    public void signUp(View view) {
        //Intent intent = new Intent(this, Main2Activity.class);
        //startActivity(intent);
    }


}
