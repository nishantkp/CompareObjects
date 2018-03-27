package com.stepin2it.compareobjects;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new ArrayList
        List<Book> bookList = new ArrayList<>();

        // Add objects to ArrayList
        bookList.add(new Book("abd", 12));
        bookList.add(new Book("bcd", 23));

        // We want to find either name : "qwe" or price : 2 is present in the ArrayList or not
        if (bookList.contains(new Book("qwe", 2))) {
            Log.i(MainActivity.class.getSimpleName(), "success");
        } else {
            Log.i(MainActivity.class.getSimpleName(), "fail");
        }
    }
}
