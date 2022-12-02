package com.example.a432learningtask42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cannot extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cannot);
        Button btnReturn = (Button) findViewById(R.id.btn_return2);
        btnReturn.setOnClickListener(this);
        final TextView textViewToChange = (TextView) findViewById(R.id.cannotview);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Cannot");

            textViewToChange.setText(value);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Cannot.this, MainActivity.class);
        startActivity(intent);

    }
}