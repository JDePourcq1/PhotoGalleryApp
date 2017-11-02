package com.example.jdepourcq.photogalleryapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.ByteArrayOutputStream;

import static com.example.jdepourcq.photogalleryapp.GalleryActivity.REQUEST_IMAGE_CAPTURE;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

    }
    String descrpitionS = "";
    String dateS = "";
    String locationS = "";

    public void picture(View view) {
        EditText description = (EditText) findViewById(R.id.descriptionText);
        EditText location = (EditText) findViewById(R.id.locationText);
        EditText date = (EditText) findViewById(R.id.dateText);
        if(description.getText().toString().equals("")) {

        } else if(location.getText().toString().equals("")) {

        }else if(date.getText().toString().equals("")) {

        } else {
            descrpitionS = description.getText().toString();
            dateS = date.getText().toString();
            locationS = location.getText().toString();
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            Intent intent = new Intent(this, GalleryActivity.class);
            intent.putExtra("type", "addPhoto");
            intent.putExtra("location", locationS);
            intent.putExtra("date", dateS);
            intent.putExtra("description", descrpitionS);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            photo.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] byteArray = stream.toByteArray();
            intent.putExtra("photo", byteArray);
            startActivity(intent);
            //TextView viewText = (TextView) findViewById(R.id.results);
            //viewText.setText("Hi");
        }
    }
}
