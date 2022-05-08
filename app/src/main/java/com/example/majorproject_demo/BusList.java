package com.example.majorproject_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class BusList extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar  toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);
        navigationView=findViewById(R.id.navigation_view1);
        toolbar=findViewById(R.id.toolbar1);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("BUS TRANSPORT");

        drawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.list:
            Intent intent = new Intent(BusList.this, Buses_Activity.class);
            startActivity(intent);
            break;

            case R.id.home:
                Intent intent1 = new Intent(BusList.this, All_Buses.class);
                startActivity(intent1);
                break;



        }
        return true;
    }
}