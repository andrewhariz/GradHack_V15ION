package com.example.v15ion_19;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginSignup extends Activity {

    EditText password;
    Button login;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup);
        final String username="josh";
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if(Objects.equals(username, "josh")&&Objects.equals(password.getText().toString(),"0123"))
                {
                    startActivity(new Intent(LoginSignup.this, HomeDashboard.class));
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

    private void generate(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

        View v = getLayoutInflater().inflate(R.layout.fingerprintactivity, null);

        AlertDialog al = builder.create();
        al.show();

    }






}



