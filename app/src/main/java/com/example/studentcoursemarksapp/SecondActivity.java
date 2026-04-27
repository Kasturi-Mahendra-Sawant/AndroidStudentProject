package com.example.studentcoursemarksapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText etCourse, etMarks;
    Button btnNext2, btnBack;


    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etCourse = findViewById(R.id.etCourse);
        etMarks = findViewById(R.id.etMarks);
        btnNext2 = findViewById(R.id.btnNext2);
        btnBack = findViewById(R.id.btnBack);

        name = getIntent().getStringExtra("name");

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String course = etCourse.getText().toString();
                String marks = etMarks.getText().toString();

                if (course.isEmpty()) {
                    etCourse.setError("Please enter course name");
                } else if (marks.isEmpty()) {
                    etMarks.setError("Please enter marks");
                } else {
                    Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                    i.putExtra("name", name);
                    i.putExtra("course", course);
                    i.putExtra("marks", marks);
                    startActivity(i);
                }
            }
        });
        // Back Button Code
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });
    }
}