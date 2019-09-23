package com.example.v15ion_19;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

public class SettingsActivity extends AppCompatActivity {

    TextView view;
    TextView view2;
    SeekBar bar;
    Button plus;
    Button minus;
    ImageButton settings;
    Button contrastButton;
    SharedPreferences sPref;
    LinearLayout mainLayout;
    TextView dashText;
    public static Boolean highContrast;
    int textSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTheme(R.style.HighContrastTheme);
        setContentView(R.layout.settings_activity);

        // demo change font and text
        view = findViewById(R.id.changeFont);
        view2 = findViewById(R.id.changeFont);
        bar = findViewById(R.id.seekBar);
        plus = findViewById(R.id.plusButton);
        minus = findViewById(R.id.minusButton);
        settings = findViewById(R.id.settings);
        contrastButton = findViewById(R.id.contrastButton);
        mainLayout = findViewById(R.id.settingsLayout);
        dashText = findViewById(R.id.dashText);
        highContrast = false;
        textSize = 12;

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat("font_size", 10);
        editor.putString("back_color", "#ffffff");
        editor.putString("font_color", "#000000");
        editor.putBoolean("contrast_mode", false);

        editor.commit();

        final SharedPreferences sPrefSettings = PreferenceManager.getDefaultSharedPreferences(this);
        String fontSize = sPrefSettings.getString("back_color", "");

        // Reading from SharedPreferences
        //System.out.println(fontSize);


        sPref = PreferenceManager.getDefaultSharedPreferences(this);


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
                textSize += 2;
                view2.setTextSize(textSize);

            }
        });

        // minus button
        minus.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                textSize -= 2;
                view2.setTextSize(textSize);

            }
        });

        // TODO: fix high contrast mode

        // high contrast button
        contrastButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                highContrast = true;
                getApplication().setTheme(R.style.HighContrastTheme);
                recreate();
            }
        });

    }
}
