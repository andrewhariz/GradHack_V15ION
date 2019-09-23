package com.example.v15ion_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {
    Button payment;
    ImageButton back;
    ImageButton im1,im2,im3,im4;
    static TextView phonenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        phonenumber = findViewById(R.id.mob);
        payment = findViewById(R.id.PayButton);
        payment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        back = findViewById(R.id.backButton1);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        im1 = findViewById(R.id.f1);
        im1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                phonenumber.setText("9191929924");
            }
        });
        im2 = findViewById(R.id.f2);
        im2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                phonenumber.setText("9865325421");
            }
        });

        im3 = findViewById(R.id.f3);
        im3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                phonenumber.setText("7845125623");
            }
        });

        im4 = findViewById(R.id.f4);
        im4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                phonenumber.setText("8798653212");
            }
        });
    }
}
