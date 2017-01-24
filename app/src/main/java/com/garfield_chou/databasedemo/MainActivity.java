package com.garfield_chou.databasedemo;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null);

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS users (name VARCHAR, age INT(3))");

            myDatabase.execSQL("INSERT INTO users (name, age) VALUES ('Rob', 34)");

            myDatabase.execSQL("INSERT INTO users (name, age) VALUES ('garfield', 34)");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
