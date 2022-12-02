package com.example.a432learningtask42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Retire extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retire);
        Button btnReturn = (Button) findViewById(R.id.btn_return3);
        btnReturn.setOnClickListener(this);
        final TextView textViewToChange = (TextView) findViewById(R.id.retirevalue);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Retire");

            textViewToChange.setText(value);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Retire.this, MainActivity.class);
        startActivity(intent);

    }
}