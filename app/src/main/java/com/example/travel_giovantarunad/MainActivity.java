package com.example.travel_giovantarunad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profileMenu(View v) {
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
    }

}
