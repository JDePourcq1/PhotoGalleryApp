package com.example.jdepourcq.photogalleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    int number = 0;
    int max = 0;
    List<Pictures> pictures;
    DBHandler db = new DBHandler(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        String location = getIntent().getStringExtra("location");
        String type = getIntent().getStringExtra("type");

        if (type.equals("start")) {
            max = 0;
            number = 0;
            pictures = db.getAllPictures();
            for (Pictures picture : pictures) {
                max++;
            }
            display();

        } else if(type.equals("search")) {
            max = 0;
            number = 0;
            String description = getIntent().getStringExtra("description");
            if(!location.equals("") && description.equals("")) {
                pictures = db.getLocationPictures(location);
                for (Pictures picture : pictures) {
                    max++;
                }
                display();
            } else if(location.equals("") && description.equals("")){
                pictures = db.getAllPictures();
                for (Pictures picture: pictures) {
                    max++;
                }
                display();
            } else if(location.equals("") && !description.equals("")) {
                pictures = db.getDescriptionPictures(description);
                for(Pictures picture : pictures) {
                    max++;
                }
                display();
            } else if(!location.equals("") && !description.equals("")) {
                pictures = db.getDescriptionLocationPictures(location, description);
                for(Pictures picture: pictures) {
                    max++;
                }
                display();
            }


        } else if(type.equals("addPhoto")) {
            //TextView viewText = (TextView) findViewById(R.id.results);
            String date = getIntent().getStringExtra("date");
            String description = getIntent().getStringExtra("description");
            byte[] picture = getIntent().getByteArrayExtra("picture");
            //viewText.setText(location);
            db.addPicture(new Pictures(location, description, date, picture));
            max = 0;
            number = 0;
            pictures = db.getAllPictures();
            for (Pictures picture1 : pictures) {
                max++;
            }
            display();
        }

    }

    static final int REQUEST_IMAGE_CAPTURE = 1;


    public void camera(View view) {
        //Camera.open();
        //Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);

    }

    public void search(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void picture(View view) {
        Intent intent = new Intent(this, PictureActivity.class);
        startActivity(intent);
    }

    public void next(View view) {
        if(number != max-1) {
            number++;
            display();
        }
    }

    public void previous(View view) {
        if(number != 0) {
            number --;
            display();
        }
    }

    public void display() {
        String[] locationA = new String[100];
        String[] descriptionA = new String[100];
        String[] dateA = new String[100];
        //List<byte[]> photoA= new ArrayList<>();
        int i = 0;
        for (Pictures picture : pictures) {
            //log += "ID: " + picture.getId() + " ,Location: " + picture.getLocation() + " ";
            locationA[i] = picture.getLocation();
            descriptionA[i] = picture.getDescription();
            dateA[i] = picture.getDate();
            //photoA.add(picture.getPicture());
            i++;
            //max++;
        }

        TextView textDescription = (TextView) findViewById(R.id.descriptionText);
        textDescription.setText(descriptionA[number]);
        TextView textLocation = (TextView) findViewById(R.id.locationText);
        textLocation.setText(locationA[number]);
        TextView textDate = (TextView) findViewById(R.id.dateText);
        textDate.setText(dateA[number]);
    }
}
