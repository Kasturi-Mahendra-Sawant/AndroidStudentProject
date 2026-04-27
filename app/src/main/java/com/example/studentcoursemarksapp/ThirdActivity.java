package com.example.studentcoursemarksapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    TextView tvResult;
    Button btnBack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        TextView tvResult = findViewById(R.id.tvResult);
        btnBack3 = findViewById(R.id.btnBack3);

        String name = getIntent().getStringExtra("name");
        String course = getIntent().getStringExtra("course");
        String marks = getIntent().getStringExtra("marks");

        tvResult.setText(
                "\nStudent Name: " + name +
                        "\nCourse: " + course +
                        "\nMarks: " + marks);
        // Back button
        btnBack3.setOnClickListener(v -> finish());
    }
}