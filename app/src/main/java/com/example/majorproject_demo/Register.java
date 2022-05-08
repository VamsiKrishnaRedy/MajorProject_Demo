package com.example.majorproject_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {


    EditText e1,e2,e3;
    Button b1;
    String s1,s2,s3;
    TextView signintxtview;

    FirebaseDatabase firebaseDatabase;
    Insert insert;

    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        b1=(Button)findViewById(R.id.signupbutton);
        signintxtview=findViewById(R.id.signinlink);

        firebaseDatabase = FirebaseDatabase.getInstance();

        // below line is used to get reference for our database.
        databaseReference = firebaseDatabase.getReference("Student Data");
        insert=new Insert();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 s1=e1.getText().toString().trim();
                 s2=e2.getText().toString().trim();
                 s3=e3.getText().toString().trim();
                if(TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3)){
                    Toast.makeText(Register.this,"Insert Valid data",Toast.LENGTH_SHORT).show();
                }else{
                    addDatatoFirebase(s1,s2,s3);
                }

            }
        });
        signintxtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });

    }

    public void addDatatoFirebase(String name, String mail, String pass) {

        insert.setUsername(name);
        insert.setEmail(mail);
        insert.setPassword(pass);
        String t1=s1;



        // we are use add value event listener method
        // which is called with database reference.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // inside the method of on Data change we are setting
                // our object class to our database reference.
                // data base reference will sends data to firebase.
                databaseReference.child(t1).setValue(insert);

                // after adding this data we are showing toast message.
                Toast.makeText(Register.this, "data added", Toast.LENGTH_SHORT).show();
               e1.setText("");
               e2.setText("");
               e3.setText("");
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Register.this, "data failed to add", Toast.LENGTH_SHORT).show();

            }



        });

    }
}