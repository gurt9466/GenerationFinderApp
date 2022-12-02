package com.example.generationfinderapp;

import androidx.appcompat.app.AppCompatActivity;
import java.time.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etinsert;
    String strtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        ComputeResult();
    }

    public void ComputeResult(){
        etinsert = (EditText) findViewById(R.id.etinsert);
        if(etinsert.getText().toString().isEmpty()){
            strtext = "0";
        }else{
            strtext = etinsert.getText().toString();
        }

        Year thisYear = Year.now();
        int search = Integer.parseInt(strtext);
        int year = Integer.parseInt(String.valueOf(thisYear));
        int dob = year-search;
        int a = 0;

        if(dob <=1945){
        a = (1);
        }else if(dob <=1964){
            a = (2);
        } else if (dob <=1976){
            a = (3);
        } else if (dob <=1995) {
            a = (4);
        }else if (dob <=2012) {
                a = (5);
        }else if (dob <=2024) {
            a = (6);
        }
        switch (a){
            case 1 :
                Intent intent1 = new Intent(MainActivity.this, Gone.class);
                startActivity(intent1);
                break;

            case 2 : Intent intent2 = new Intent(MainActivity.this, Gtwo.class);
                startActivity(intent2);
                break;

            case 3 : Intent intent3 = new Intent(MainActivity.this, Gthree.class);
                startActivity(intent3);
                break;

            case 4 : Intent intent4 = new Intent(MainActivity.this, Gfour.class);
                startActivity(intent4);
                break;

            case 5 : Intent intent5 = new Intent(MainActivity.this, Gfive.class);
                startActivity(intent5);
                break;

            case 6 : Intent intent6 = new Intent(MainActivity.this, Gsix.class);
                startActivity(intent6);
                break;
        }
    }







}

