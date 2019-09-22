package com.example.v15ion_19;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.v15ion_19.R;

import java.util.ArrayList;
import java.util.List;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class HomeDashboard extends Activity {

    static ImageButton settings;
    static Button transfer;
    static Button payment;
    private ViewPager screenPager;
    PagerAdapter introViewPagerAdapter ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final List<ModelDashboard> mList = new ArrayList<>();
        mList.add(new ModelDashboard(99999,"xxxx xxxx xxxx 9102","Visa"));
        mList.add(new ModelDashboard(700,"xxxx xxxx xxxx 7841","Visa"));
        mList.add(new ModelDashboard(14590,"xxxx xxxx xxxx 4544","Rupay"));


        // setup viewpager
        screenPager =findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new CustomAdapter(mList,this);
        screenPager.setAdapter(introViewPagerAdapter);


        settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomeDashboard.this,SettingsActivity.class));
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
    }
}
