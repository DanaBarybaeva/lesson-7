package com.example.navigation.Database;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.navigation.R;

public class StoreDatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "lessondatabase.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_USERS = "users";
    public static final String COLUMN_USER_NAME = "user_name";
    public static final String COLUMN_USER_EMAIL = "user_email";
    public static final String COLUMN_USER_PASSWORD = "user_password";

    Context context;



    public StoreDatabase(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE users" + TABLE_USERS + "("+
                COLUMN_USER_NAME + "TEXT," +
                COLUMN_USER_EMAIL  + "TEXT," +
                COLUMN_USER_PASSWORD +"INTEGER)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);

        onCreate(db);

    }
}
