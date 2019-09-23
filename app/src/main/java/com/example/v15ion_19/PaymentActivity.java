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
    TextView phoneNumber;
    ImageButton im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        phoneNumber = findViewById(R.id.mob);
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
        im1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                phoneNumber.setText("9872845236");
            }
        });



    }
}
