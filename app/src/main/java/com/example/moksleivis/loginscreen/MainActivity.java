package com.example.moksleivis.loginscreen;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    Button btnRegister;
    Button btnLogin;
    EditText etLoginUsername;
    EditText etLoginPass;
    CheckBox cbRememberMe;
    SharedPreferences loginPreferences;
    SharedPreferences.Editor  loginPrefsEditor;
    Boolean saveLogin;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intentLogin = new Intent(MainActivity.this,
                            LoginActivity.class);
                    startActivity(intentLogin);
                }
        });

        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegister = new Intent(MainActivity.this,
                        RegisterActivity.class);
                startActivity(intentRegister);

            }
        });

    }

}
