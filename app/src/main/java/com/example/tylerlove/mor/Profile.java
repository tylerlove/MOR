package com.example.tylerlove.mor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class Profile extends AppCompatActivity {

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

    public void editProfile(View view){

//        ImageButton editProf = (ImageButton) findViewById(R.id.editProfile);
        Intent i = new Intent(getApplicationContext(), EditProfile.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
