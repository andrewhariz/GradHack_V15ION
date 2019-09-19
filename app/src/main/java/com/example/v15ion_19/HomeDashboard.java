package com.example.v15ion_19;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.preference.PreferenceManager;

import com.example.v15ion_19.R;

public class HomeDashboard extends Activity {

    Button settings;
    TextView balanceText;
    private SharedPreferences sPref;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sPref = PreferenceManager.getDefaultSharedPreferences(this);
        balanceText= findViewById(R.id.balance_text);
        balanceText.setTextSize(sPref.getFloat("font_size", 14));
        settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomeDashboard.this,SettingsActivity.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDashboard.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
