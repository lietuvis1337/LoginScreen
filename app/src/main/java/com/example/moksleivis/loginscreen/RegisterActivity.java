package com.example.moksleivis.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by moksleivis on 2018-01-19.
 */


public class RegisterActivity extends MainActivity {

    Button btnRegister;
    Button btnCancel;
    EditText etUsername;
    EditText etPassword;
    EditText etPasswordRepeat;
    EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();

        etUsername = (EditText) findViewById(R.id.registerEtUsername);
        etPassword = (EditText) findViewById(R.id.registerEtPassword);
        etPasswordRepeat = (EditText) findViewById(R.id.registerEtRepeatPassword);
        etEmail = (EditText) findViewById(R.id.registerEtEmail);

        btnRegister = (Button) findViewById(R.id.registerBtnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etUsername.getText().toString().trim().length() == 0 ||
                        (etUsername.getText().toString().length()>15)){
                    etUsername.setError("You must enter username");
                }else if(!(etPassword.getText().toString().equals(
                        etPasswordRepeat.getText().toString()))){
                        etPasswordRepeat.setError("Your passwords doestn match");
                }else if(etEmail.getText().toString().trim().length()==0 ||
                        (!etEmail.getText().toString().toString().contains("@"))){
                        etEmail.setError("You must enter valid email");
                }else if(etPassword.getText().toString().trim().length() == 0 ||
                        (etPasswordRepeat.getText().toString().trim().length() == 0)) {
                        etPassword.setError("Passwords cant be empy");
                }else {

                        Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        Toast toast = Toast.makeText(RegisterActivity.this,"Registration complete \n" +
                                "You can now login.",Toast.LENGTH_LONG);
                        toast.show();

                }
            }
        });

        btnCancel = (Button) findViewById(R.id.registerBtnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


    }
}
