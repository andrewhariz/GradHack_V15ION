package com.example.v15ion_19;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsActivity extends AppCompatActivity {

    TextView view;
    TextView view2;
    SeekBar bar;
    Button plus;
    Button minus;
    Button settings;
    Button backButton;
    LinearLayout layout;
    LinearLayout mainLayout;
    Button backgroundButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        // demo change font and text
        view = findViewById(R.id.changeFont);
        view2 = findViewById(R.id.changeFont);
        bar = findViewById(R.id.seekBar);
        plus = findViewById(R.id.plusButton);
        minus = findViewById(R.id.minusButton);
        settings = findViewById(R.id.settings);
        layout = findViewById(R.id.settingsLayout);
        backgroundButton = findViewById(R.id.backgroundButton);
        mainLayout = findViewById(R.id.layout);
        backButton = findViewById(R.id.backButton);


        
        // TODO: Set text size for all activities instead of the demo text
        
        // slider bar
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                view.setTextSize(i);
                MainActivity.edtTexttoSpeak.setTextSize(20);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        
        // plus button
        plus.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                view2.setTextSize(view2.getTextSize() + 3);
                settings.setTextSize(15);

            }
        });
        
        // minus button
        minus.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                view2.setTextSize((float) view2.getTextSize());
            }
        });
        
        // TODO: add high contrast mode
        // black background, neon text

        backgroundButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                mainLayout.setBackgroundColor(Color.BLACK);
                view2.setTextColor(Color.GREEN);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, HomeDashboard.class);
                startActivity(intent);
            }
        });
    }
}
