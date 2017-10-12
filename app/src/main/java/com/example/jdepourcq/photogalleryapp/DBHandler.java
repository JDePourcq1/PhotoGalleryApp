package com.example.jdepourcq.photogalleryapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JDePourcq on 2017-10-04.
 */

public class DBHandler extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "pictureInfo";
    // Contacts table name
    private static final String TABLE_PICTURE = "pictures";
    // Shops Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_LOCATION = "location";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PICTURE);
        db.execSQL("delete from " + TABLE_PICTURE);
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_PICTURE + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_LOCATION + " TEXT)";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PICTURE);
        // Creating tables again
        onCreate(db);
    }

    public void addPicture(Pictures picture) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_LOCATION, picture.getLocation()); // Shop Name
// Inserting Row
        db.insert(TABLE_PICTURE, null, values);
        db.close(); // Closing database connection
    }

    public List<Pictures> getAllPictures() {
        List<Pictures> shopList = new ArrayList<Pictures>();
// Select All Query
        String selectQuery = "SELECT DISTINCT * FROM " + TABLE_PICTURE;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Pictures shop = new Pictures();
                shop.setId(Integer.parseInt(cursor.getString(0)));
                shop.setLocation(cursor.getString(1));
// Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }
// return contact list
        return shopList;
    }

    public List<Pictures> getCertainPictures(String location) {
        List<Pictures> shopList = new ArrayList<Pictures>();
// Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_PICTURE + " WHERE " + KEY_LOCATION + " = '" + location + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Pictures shop = new Pictures();
                shop.setId(Integer.parseInt(cursor.getString(0)));
                shop.setLocation(cursor.getString(1));
// Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }
// return contact list
        return shopList;
    }

    public int getCount() {
        String countQuery = "SELECT * FROM " + TABLE_PICTURE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
// return count
        return cursor.getCount();
    }
}


