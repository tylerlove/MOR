package com.example.tylerlove.mor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Notifications extends AppCompatActivity {
    public void buttonClicked(View view){
        ImageButton imgButton = (ImageButton) findViewById(R.id.notifs);
//        imgButton.setBackground();
        imgButton.setBackgroundColor(0xff00ffff);
    }

    public void gotoProfile(View view){
        Intent i = new Intent(getApplicationContext(), Profile.class);
        startActivity(i);
    }

    public void gotoNotifs(View view){
        Intent i = new Intent(getApplicationContext(), Notifications.class);
        startActivity(i);
    }
    public void gotoNewsFeed(View view){
        Intent i = new Intent(getApplicationContext(), NewsFeed.class);
        startActivity(i);
    }
    public void gotoAddACause(View view){
        Intent i = new Intent(getApplicationContext(), AddACause.class);
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
