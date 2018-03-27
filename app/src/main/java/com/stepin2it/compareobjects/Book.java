package com.stepin2it.compareobjects;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;

/**
 * Custom Book object with getters
 * Created by Nishant on 3/27/2018.
 */

public class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    /* List uses .contains() method to compare Objects which uses .equals()
    So if we want to check if a certain value if present in our List<Object>,
    we have to @Override .equals() method in object class */
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object obj) {
        // Check is the name or price of the Book are present in List, return true
        // else false.
        if (obj instanceof Book) {
            if (Objects.equals(((Book) obj).name, this.name)
                    || ((Book) obj).price == this.price) {
                return true;
            }
        }
        return false;
    }
}
