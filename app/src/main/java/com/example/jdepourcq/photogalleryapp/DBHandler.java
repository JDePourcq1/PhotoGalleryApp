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
    private static final String DATABASE_NAME = "pictureHolder";
    // Contacts table name
    private static final String TABLE_PICTURE = "pictures";
    // Shops Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_LOCATION = "location";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_DATE = "date";
    private static final String KEY_IMAGE = "image";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PICTURE);
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_PICTURE + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_IMAGE + " IMAGE," + KEY_LOCATION + " LOCATION," + KEY_DESCRIPTION + " DESCRIPTION," + KEY_DATE + " DATE)" ;
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
        values.put(KEY_IMAGE, picture.getPicture());
        values.put(KEY_LOCATION, picture.getLocation());
        values.put(KEY_DESCRIPTION, picture.getDescription());
        values.put(KEY_DATE, picture.getDate());
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
                shop.setPicture(cursor.getBlob(1));
                shop.setLocation(cursor.getString(2));
                shop.setDescription(cursor.getString(3));
                shop.setDate(cursor.getString(4));
// Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }
// return contact list
        return shopList;
    }

    public List<Pictures> getLocationPictures(String location) {
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
                shop.setPicture(cursor.getBlob(1));
                shop.setLocation(cursor.getString(2));
                shop.setDescription(cursor.getString(3));
                shop.setDate(cursor.getString(4));
// Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }
// return contact list
        return shopList;
    }

    public List<Pictures> getDescriptionPictures(String descrip) {
        List<Pictures> shopList = new ArrayList<Pictures>();

        String selectQuery = "SELECT * FROM " + TABLE_PICTURE + " WHERE " + KEY_DESCRIPTION + " LIKE '%" + descrip + "%'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Pictures shop = new Pictures();
                shop.setId(Integer.parseInt(cursor.getString(0)));
                shop.setPicture(cursor.getBlob(1));
                shop.setLocation(cursor.getString(2));
                shop.setDescription(cursor.getString(3));
                shop.setDate(cursor.getString(4));
// Adding contact to list
                shopList.add(shop);
            } while (cursor.moveToNext());
        }
// return contact list
        return shopList;
    }

    public List<Pictures> getDescriptionLocationPictures(String location, String descrip) {
        List<Pictures> shopList = new ArrayList<Pictures>();

        String selectQuery = "SELECT * FROM " + TABLE_PICTURE + " WHERE " + KEY_DESCRIPTION + " LIKE '%" + descrip + "%' AND " + KEY_LOCATION + " = '" + location + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Pictures shop = new Pictures();
                shop.setId(Integer.parseInt(cursor.getString(0)));
                shop.setPicture(cursor.getBlob(1));
                shop.setLocation(cursor.getString(2));
                shop.setDescription(cursor.getString(3));
                shop.setDate(cursor.getString(4));
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


