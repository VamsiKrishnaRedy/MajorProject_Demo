package com.example.majorproject_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select_Bus_Student extends AppCompatActivity {
        Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bus_student);
        b1=findViewById(R.id.Driver);
        b2=findViewById(R.id.Student1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Select_Bus_Student.this,DriverLogin.class);
                startActivity(intent);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Select_Bus_Student.this,Register.class);
                startActivity(intent);
            }
        });
    }
}