package com.example.v15ion_19;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Objects;

public class LoginSignup extends Activity {

    RelativeLayout loginLayout;
    EditText password;
    //TextView usernameText;
    TextView topSignUp;
    Button login;
    Button signup;
    Button highContrast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup);
        final String username = "josh";
        loginLayout = findViewById(R.id.login_layout);
        topSignUp = findViewById(R.id.signup_upper_right);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(username, "josh") && Objects.equals(password.getText().toString(), "0123")) {
                    startActivity(new Intent(LoginSignup.this, HomeDashboard.class));
                    Toast.makeText(LoginSignup.this, "You have Authenticated Successfully", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LoginSignup.this, "Authentication Failed", Toast.LENGTH_LONG).show();
                }
            }
        });



        topSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginSignup.this, Register.class));
            }
        });

        /*
        highContrast = findViewById(R.id.high_contrast);
        highContrast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password.setTextColor(Color.GREEN);
                password.setBackgroundColor(Color.GRAY);
                loginLayout.setBackgroundColor(Color.BLACK);
                topSignUp.setBackgroundColor(Color.GREEN);

                //buttons
                login.setBackgroundColor(Color.GREEN);
                signup.setBackgroundColor(Color.GREEN);
                highContrast.setBackgroundColor(Color.GREEN);
                login.setTextColor(Color.BLACK);
                signup.setTextColor(Color.BLACK);
                highContrast.setTextColor(Color.BLACK);

                TextView usernameText = findViewById(R.id.username);
                usernameText.setTextColor(Color.GREEN);
            }
        });
         */


    }

    private void generate() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

        View v = getLayoutInflater().inflate(R.layout.fingerprintactivity, null);

        AlertDialog al = builder.create();
        al.show();
    }
}



