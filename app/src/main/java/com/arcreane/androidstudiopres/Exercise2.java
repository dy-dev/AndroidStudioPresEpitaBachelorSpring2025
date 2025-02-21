package com.arcreane.androidstudiopres;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        RelativeLayout main = findViewById(R.id.main);
        main.setBackgroundColor(getResources().getColor(R.color.greenish, getTheme()));
    }
}