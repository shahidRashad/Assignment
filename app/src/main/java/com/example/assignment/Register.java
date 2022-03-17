package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    String state [] = {"Select District","Thiruvananthapuram","Kollam","Pathanamthtta","Kottayam","Idukki","Alappuzha","Ernakulam","Palakkad","Thrissure","Malappuram","Kozhikode","Wayanad","Kannur","kasargode"};
    Spinner dist;
    CheckBox mal, eng, hind, tam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        dist = (Spinner)findViewById(R.id.state);
        ArrayAdapter arr = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,state);
        dist.setAdapter(arr);
        dist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              if (i!=0) {
                  Toast.makeText(getApplicationContext(), state[i]+" is selected", Toast.LENGTH_SHORT).show();

              }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup);
        rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton r = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                String str = r.getText().toString();
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox mal = (CheckBox)findViewById(R.id.malayalam);
        CheckBox eng = (CheckBox)findViewById(R.id.english);
        CheckBox hind = (CheckBox)findViewById(R.id.hindi);
        CheckBox tam = (CheckBox)findViewById(R.id.tamil);




        Button reg = (Button) findViewById(R.id.register);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pswd = password.getText().toString();
                Intent i = new Intent(getApplicationContext(),Login.class);
                i.putExtra("username",uname);
                i.putExtra("password",pswd);
                startActivity(i);
            }
        });
    }

    public void click(View view) {
        boolean check = ((CheckBox) view).isChecked();
        String str = " ";
        switch (view.getId()){
            case R.id.malayalam:
                str = check? "Malayalam is Selected":"Malayalam is Deselected";
                break;
            case R.id.english:
                str = check? "English is Selected":"English is Deselected";
                break;
            case R.id.hindi:
                str = check? "Hindi is Selected":"Hindi is Deselected";
                break;
            case R.id.tamil:
                str = check? "Tamil is Selected":"Tamil is Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}