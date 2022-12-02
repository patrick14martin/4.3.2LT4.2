package com.example.a432learningtask42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText first,second,third;
    int age, expense, income, net, years, able;


    public void Retirement(View v) {
        first = findViewById(R.id.etNumber1);
        second = findViewById(R.id.etNumber2);
        third = findViewById(R.id.etNumber3);

        Button calculate = findViewById(R.id.button);

        String a = first.getText().toString();
        String b = second.getText().toString();
        String c = third.getText().toString();
        if(first.getText().toString().isEmpty() || second.getText().toString().isEmpty() || third.getText().toString().isEmpty()){
            age = 0;
            expense = 0;
            income = 0;
        } else {
            age = Integer.parseInt(a);
            expense = Integer.parseInt(b);
            income = Integer.parseInt(c);
        }
        net = income - expense;
        years = 60 - age;
        able = net * years;
        switch (checker(able)) {

            case 1: {
                String f = String.valueOf(able);
                Intent retire = new Intent(MainActivity.this, Retire.class);
                retire.putExtra("Retire", f);
                startActivity(retire);
                break;
            }
            case 2: {
                String f = String.valueOf(able);
                Intent cannot = new Intent(MainActivity.this, Cannot.class);
                cannot.putExtra("Cannot", f);
                startActivity(cannot);
                break;
            }
            case 3: {
                Intent error = new Intent(MainActivity.this, Error.class);
                startActivity(error);
            }
        }
    }

        public int checker(int able) {
            if (able >= 5000000) {
                return 1;
            } else if (able == 0) {
                return 3;
            } else {
                return 2;
            }
        }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}