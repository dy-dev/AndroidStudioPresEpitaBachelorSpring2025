package com.arcreane.androidstudiopres;

import android.os.Bundle;
import android.widget.ImageView;
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

        TextView tv4 = findViewById(R.id.textView4);
        TextView tv5 = findViewById(R.id.textView5);

        tv4.setText(R.string.changed_with_r_string);

        String textToChange = getResources().getString(R.string.changed_with_getressources);
        tv5.setText(textToChange);

        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(android.R.drawable.ic_delete);

    }
}