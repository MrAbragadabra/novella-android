package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Disclaimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        // Задача размеров приложения на весь экран
        getWindow().setFlags(512, 512);
    }
}