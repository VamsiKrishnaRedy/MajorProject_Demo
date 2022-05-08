package com.example.majorproject_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.majorproject_demo.Buses_Activity.sd;

public class DriverLogin extends AppCompatActivity {

    EditText e1,e2;
    TextView t1,t2;
    Button b1;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    ProgressBar progressBar;
     /*String busdata1;
     String dd1;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);


        e1=findViewById(R.id.e11);
        e2=findViewById(R.id.e22);
        b1=findViewById(R.id.signinbutton);
        t1=findViewById(R.id.signuplink);
        progressBar=findViewById(R.id.progressbar);
        firebaseDatabase = FirebaseDatabase.getInstance();

        // below line is used to get
        // reference for our database.
        databaseReference = firebaseDatabase.getReference("Buses");


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                String s1=e1.getText().toString().trim();
                String s2=e2.getText().toString().trim();

                databaseReference.addValueEventListener(new ValueEventListener() {
                    private Object Bus_Data;

                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String id=s1;
                        //Insert insert= snapshot.child(id).getValue(Insert.class);
                        Bus_Data1 bus_data=snapshot.child(id).getValue(Bus_Data1.class);
                        //busdata1= snapshot.child(id).child("BusNo").getValue().toString();
                         //dd1=snapshot.child(id).child("Password").getValue().toString();
                        Toast.makeText(DriverLogin.this,"Welcome ",Toast.LENGTH_LONG).show();
                        /*if(busdata1.equals(s1) && dd.equals(s2)){
                            //Intent intent= new Intent(DriverLogin.this,MapsActivity.class);
                            //startActivity(intent);

                            Toast.makeText(DriverLogin.this,"Welcome "+busdata1,Toast.LENGTH_LONG).show();
                        }*/

                        assert bus_data != null;
                        if(bus_data.getBusNo().equals(s1) && bus_data.getPassword().equals(s2)){
                            Intent intent= new Intent(DriverLogin.this,FrequentActivity.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(DriverLogin.this,"Invalid Details",Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DriverLogin.this,FrequentActivity.class);
                startActivity(intent);
            }
        });




    }
}