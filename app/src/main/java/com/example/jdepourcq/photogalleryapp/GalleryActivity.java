package com.example.jdepourcq.photogalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    DBHandler db = new DBHandler(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        String location = getIntent().getStringExtra("location");

        if (location.equals("start")) {

            /*if (db.getCount() < 1) { //if there's nothing in the result
                db.addPicture(new Pictures("Vancouver"));
                db.addPicture(new Pictures("Edmonton"));
                db.addPicture(new Pictures("Anaheim"));
            }*/

            List<Pictures> pictures = db.getAllPictures();
            String log = "";
            for (Pictures picture : pictures) {
                log += "ID: " + picture.getId() + " ,Location: " + picture.getLocation() + " ";

            }
            TextView viewText = (TextView) findViewById(R.id.results);
            viewText.setText(log);

        } else {
            List<Pictures> pictures = db.getCertainPictures(location);
            String log = "";
            for (Pictures picture : pictures) {
                log += "ID: " + picture.getId() + " ,Location: " + picture.getLocation() + " ";

            }
            TextView viewText = (TextView) findViewById(R.id.results);
            viewText.setText(log);
            Log.d("", log);
        }





       /* if(location == "location") {

        }*/
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
