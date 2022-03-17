package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Gridview extends AppCompatActivity {

    String country[]= {"Australia","China","India","Amercia","Russia"};
    int countrypic[] = {R.drawable.aus,R.drawable.china,R.drawable.india,R.drawable.america,R.drawable.russia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        GridView gridview = (GridView) findViewById(R.id.gridview);

        CustomGrid cgrid = new CustomGrid(getApplicationContext(),country,countrypic);
        gridview.setAdapter(cgrid);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int image = countrypic[i];
                Intent intent = new Intent(getApplicationContext(),Details.class);
                intent.putExtra("photo",image);
                intent.putExtra("name",country[i]);
                startActivity(intent);
            }
        });




    }
}