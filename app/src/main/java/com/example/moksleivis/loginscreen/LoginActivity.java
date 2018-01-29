package com.example.moksleivis.loginscreen;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

/**
 * Created by moksleivis on 2018-01-19.
 */

public class LoginActivity extends MainActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("User info:");

        Intent intent = getIntent();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(this,"Add clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(this,"Search clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:

        }
        return super.onOptionsItemSelected(item);
    }




}
