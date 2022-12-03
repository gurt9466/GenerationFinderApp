package com.example.generationfinderapp;

import androidx.appcompat.app.AppCompatActivity;
import java.time.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etinsert, etinsert2, etinsert3;
    String stryear, strmonth, strday ,resultMessage;
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
        etinsert2 = (EditText) findViewById(R.id.etinsert2);
        etinsert3 = (EditText) findViewById(R.id.etinsert3);
        if(etinsert.getText().toString().isEmpty() ||etinsert2.getText().toString().isEmpty() || etinsert3.getText().toString().isEmpty()){
            stryear = "0";
        }else{
            stryear = etinsert.getText().toString();
            strday = etinsert3.getText().toString();
            strmonth =  etinsert2.getText().toString();
        }

        Year thisYear = Year.now();
        int search = Integer.parseInt(stryear);
        int month = Integer.parseInt(strmonth);
        int day = Integer.parseInt(strday);
        int a = 0;

        LocalDate tdob = LocalDate.of(search, month, day);
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(tdob, curDate);

        if(search <=1945){
        a = (1);
        }else if(search <=1964){
            a = (2);
        } else if (search <=1976){
            a = (3);
        } else if (search <=1995) {
            a = (4);
        }else if (search <=2012) {
                a = (5);
        }else if (search <=2024) {
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
        resultMessage = "CURRENT AGE :\n  "+ period.getYears()+" Years ,  "+ period.getMonths()+" Months, "+ period.getDays() + " Days\n"+ "  Year Born : "+search;
        Bundle args = new Bundle();
        args.putString("result", resultMessage);
        if(search <=1945){
            Intent intent = new Intent(MainActivity.this, Gone.class);
            intent.putExtras(args);
            startActivity(intent);
        }else if(search <=1964){
            Intent intent = new Intent(MainActivity.this, Gtwo.class);
            intent.putExtras(args);
            startActivity(intent);
        } else if (search <=1976){
            Intent intent = new Intent(MainActivity.this, Gthree.class);
            intent.putExtras(args);
            startActivity(intent);
        } else if (search <=1995) {
            Intent intent = new Intent(MainActivity.this, Gfour.class);
            intent.putExtras(args);
            startActivity(intent);
        }else if (search <=2012) {
            Intent intent = new Intent(MainActivity.this, Gfive.class);
            intent.putExtras(args);
            startActivity(intent);
        }else if (search <=2024) {
            Intent intent = new Intent(MainActivity.this, Gsix.class);
            intent.putExtras(args);
            startActivity(intent);
        }

    }







}

