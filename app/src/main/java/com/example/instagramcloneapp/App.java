package com.example.instagramcloneapp;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JasaSI4cq3HmBD3aBJiYzxRdZk8CKEoRh0QZNIgE")
                // if defined
                .clientKey("WClONw1K62QT7rkjvmPiu9Gc2UBip9wr3iusbYvF")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
