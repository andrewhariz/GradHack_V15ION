package com.example.v15ion_19;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.v15ion_19.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.RequiresApi;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class HomeDashboard extends Activity {

    static ImageButton settings;
    static Button transfer;
    static Button payment;
    static Button services;
    ImageButton minusButton;
    ImageButton plusButton;
    private ViewPager screenPager;
    PagerAdapter introViewPagerAdapter;
    int fontSize;

    TextView dashText;
    TextView welcomeText;
    TextView balance;
    TextView transactionsText;
    TextView transaction1Text;
    TextView transaction2Text;
    TextView transaction3Text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final List<ModelDashboard> mList = new ArrayList<>();
        mList.add(new ModelDashboard(99999, "xxxx xxxx xxxx 9102", "Visa"));
        mList.add(new ModelDashboard(700, "xxxx xxxx xxxx 7841", "Visa"));
        mList.add(new ModelDashboard(14590, "xxxx xxxx xxxx 4544", "Rupay"));


        // setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new CustomAdapter(mList, this);
        screenPager.setAdapter(introViewPagerAdapter);
        fontSize = 19;


        settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomeDashboard.this, SettingsActivity.class));
            }
        });
        transfer = findViewById(R.id.transferButton);
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDashboard.this, TransferActivity.class);
                startActivity(intent);
            }
        });

        payment = findViewById(R.id.PayButton);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDashboard.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

        // TODO: change font size of all text, not just buttons

        services = findViewById(R.id.services_button);
        plusButton = findViewById(R.id.plus_button);
        minusButton = findViewById(R.id.minus_button);

        // dashboard text items
        dashText = findViewById(R.id.dash_text);
        welcomeText = findViewById(R.id.welcome_message);
        transactionsText = findViewById(R.id.transactions_text);
        transaction1Text = findViewById(R.id.transaction1);
        transaction2Text = findViewById(R.id.transaction2);
        transaction3Text = findViewById(R.id.transaction3);


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                transfer.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17f);
                payment.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17f);
                services.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17f);

                // increment text sizes by 20 pixels
                dashText.setTextSize(TypedValue.COMPLEX_UNIT_PX,dashText.getTextSize() + 20f);
                welcomeText.setTextSize(TypedValue.COMPLEX_UNIT_PX,welcomeText.getTextSize() + 20f);
                transactionsText.setTextSize(TypedValue.COMPLEX_UNIT_PX,transactionsText.getTextSize() + 20f);
                transaction1Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,transaction1Text.getTextSize() + 20f);
                transaction2Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,transaction2Text.getTextSize() + 20f);
                transaction3Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,transaction3Text.getTextSize() + 20f);
                TextView v1 = findViewById(R.id.bal1);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() + 20f);
                v1 = findViewById(R.id.bal2);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() + 20f);
                v1 = findViewById(R.id.bal3);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() + 20f);
                v1 = findViewById(R.id.bal4);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() + 20f);
                v1 = findViewById(R.id.bal5);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() + 20f);
                v1 = findViewById(R.id.bal6);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() + 20f);

            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
//                fontSize -= 1;
                transfer.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17f);
                payment.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17f);
                services.setTextSize(TypedValue.COMPLEX_UNIT_DIP,17f);

                // decrement text sizes by 20 pixels
                dashText.setTextSize(TypedValue.COMPLEX_UNIT_PX,dashText.getTextSize() - 20f);
                welcomeText.setTextSize(TypedValue.COMPLEX_UNIT_PX,welcomeText.getTextSize() - 20f);
                transactionsText.setTextSize(TypedValue.COMPLEX_UNIT_PX,transactionsText.getTextSize() - 20f);
                transaction1Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,transaction1Text.getTextSize() - 20f);
                transaction2Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,transaction2Text.getTextSize() - 20f);
                transaction3Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,transaction3Text.getTextSize() - 20f);

                TextView v1 = findViewById(R.id.bal1);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() - 20f);
                v1 = findViewById(R.id.bal2);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() - 20f);
                v1 = findViewById(R.id.bal3);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() - 20f);
                v1 = findViewById(R.id.bal4);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() - 20f);
                v1 = findViewById(R.id.bal5);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() - 20f);
                v1 = findViewById(R.id.bal6);
                v1.setTextSize(TypedValue.COMPLEX_UNIT_PX,v1.getTextSize() - 20f);


            }
        });
    }
}
