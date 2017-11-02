package com.example.jdepourcq.photogalleryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void search(View view) {
        Intent intent = new Intent(this, GalleryActivity.class);
        EditText editText = (EditText)findViewById(R.id.location);
        intent.putExtra("type", "search");
        intent.putExtra("location", editText.getText().toString());
        EditText keyword = (EditText) findViewById(R.id.keyword);
        intent.putExtra("description", keyword.getText().toString());
        startActivity(intent);
    }
}
