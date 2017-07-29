package com.example.dell.myapplication.backend;

import com.udacity.gradle.jokes.Joker;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private Joker myJoke;

    public String getData() {
        return myJoke.getJoke();
    }


    public MyBean() {
        myJoke = new Joker();
    }
}