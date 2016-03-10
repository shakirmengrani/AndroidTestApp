package com.example.shakirmengrani.myfirsttestapp;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.widget.*;
import com.example.shakirmengrani.myfirsttestapp.models.myData;
import com.example.shakirmengrani.myfirsttestapp.adapters.listViewAdap;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    protected ListView lst;
    protected List<myData> rowItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                // startActivity(new Intent(MainActivity.this,New_act.class));
            }
        });
        rowItems = new ArrayList<myData>();
        rowItems.add(new myData("Hello","hello World into List view"));
        rowItems.add(new myData("Hello", "hello World into List view"));
        rowItems.add(new myData("Hello","hello World into List view"));
        lst = (ListView)findViewById(R.id.lst_view);
        lst.setAdapter(new listViewAdap(this,rowItems));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
