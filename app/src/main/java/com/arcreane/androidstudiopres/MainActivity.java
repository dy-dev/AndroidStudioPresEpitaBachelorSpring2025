package com.arcreane.androidstudiopres;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
//        TextView tv = new TextView(this);
//        tv.setText("Hello through Java only");
//        tv.setTextSize(60);
//        setContentView(tv);
    }
}