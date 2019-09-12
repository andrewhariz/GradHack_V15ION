package com.example.v15ion_19;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginSignup extends Activity {

    EditText username,password;
    Button login;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if(Objects.equals(username.getText().toString(), "admin")&&Objects.equals(password.getText().toString(),"admin"))
                {
                    startActivity(new Intent(LoginSignup.this, MainActivity.class));
                    Toast.makeText(LoginSignup.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                }else
                {
                    Toast.makeText(LoginSignup.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        });


        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginSignup.this, Register.class));
            }
        });

    }






}



