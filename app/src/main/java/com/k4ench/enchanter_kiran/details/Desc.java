package com.k4ench.enchanter_kiran.details;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Desc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String name=getIntent().getStringExtra("name");
        String invoice=getIntent().getStringExtra("invoice");
        String desc=getIntent().getStringExtra("desc");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
