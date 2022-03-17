package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView tv = (TextView) findViewById(R.id.cname);
        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        Intent intent1 = getIntent();
        int imageres = intent1.getIntExtra("photo",0);
        String country = intent1.getStringExtra("name");
        iv.setImageResource(imageres);
        tv.setText(country);


    }
}