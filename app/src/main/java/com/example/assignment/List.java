package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {

    String star[] = {"Sun","Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
    ListView st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        st = (ListView) findViewById(R.id.list1);
        ArrayAdapter lsit1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, star);
        st.setAdapter(lsit1);
        st.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), star[i]+" is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}