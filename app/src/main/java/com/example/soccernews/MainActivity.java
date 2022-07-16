package com.example.soccernews;

import android.app.Application;

public class MainActivity extends Application {

    private static MainActivity instance;

    public static MainActivity getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
}