package com.example.studentcoursemarksapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();

                if (name.isEmpty()) {
                    etName.setError("Please enter student name"); // validation
                } else {
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("name", name);
                    startActivity(i);
                }
            }
        });
    }
}