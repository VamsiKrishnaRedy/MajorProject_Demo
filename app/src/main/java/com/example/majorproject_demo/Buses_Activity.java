package com.example.majorproject_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Buses_Activity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
     static String sd;
    static String dd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buses);

        b1=(Button)findViewById(R.id.btn_route1);
        b2=(Button)findViewById(R.id.btn_route2);
        b3=(Button)findViewById(R.id.btn_route3);
        b4=(Button)findViewById(R.id.btn_route4);
        b5=(Button)findViewById(R.id.btn_route5);
        b6=(Button)findViewById(R.id.btn_route6);
        b7=(Button)findViewById(R.id.btn_route7);
        b8=(Button)findViewById(R.id.btn_route8);
        firebaseDatabase = FirebaseDatabase.getInstance();

        // below line is used to get
        // reference for our database.
        databaseReference = firebaseDatabase.getReference("Buses_1");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child("1001").exists()) {

                            String id="1001";
                             sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                             dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                            Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                          Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);

                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child("1002").exists()) {

                            String id="1002";
                            sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                            dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                            Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);

                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child("1003").exists()) {

                            String id="1003";
                            sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                            dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                            Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);

                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child("1004").exists()) {

                            String id="1004";
                            sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                            dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                            Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);

                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child("1005").exists()) {

                            String id="1005";
                            sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                            dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                            Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);

                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child("1006").exists()) {

                            String id="1006";
                            sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                            dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                            Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);

                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.child("1007").exists()) {

                            String id="1007";
                            sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                            dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                            //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                            Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);
                            //intent.putExtra(sd);
                            startActivity(intent);

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });

       b8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               databaseReference.addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot snapshot) {
                       if(snapshot.child("1008").exists()) {

                           String id="1008";
                           sd=snapshot.child(id).child("Starting_Address").getValue().toString();
                           dd=snapshot.child(id).child("Ending_Address").getValue().toString();
                           //Toast.makeText(Buses_Activity.this, "Welcome " +sd, Toast.LENGTH_LONG).show();
                           //Toast.makeText(Buses_Activity.this, "Welcome " +dd, Toast.LENGTH_LONG).show();
                           Intent intent= new Intent(Buses_Activity.this,MapsActivity.class);

                           startActivity(intent);

                       }
                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError error) {

                   }
               });

           }
       });
    }
}