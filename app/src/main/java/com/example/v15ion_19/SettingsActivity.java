package com.example.v15ion_19;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
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
    Button settings;
    Button contrastButton;
    SharedPreferences sPref;
    LinearLayout mainLayout;

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
        contrastButton = findViewById(R.id.contrastButton);
        mainLayout = findViewById(R.id.mainLayout);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("AppPrefs", MODE_PRIVATE);
        final SharedPreferences.Editor editor = pref.edit();
        editor.putFloat("font_size", 10);
        editor.putString("back_color", "#ffffff");
        editor.putString("font_color", "#000000");
        editor.commit();
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
                //view2.setTextSize(view2.getTextSize() + 3);
                settings.setTextSize(15);

            }
        });

        // minus button
        minus.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                view2.setTextSize(view2.getTextSize());
                editor.putFloat("font_size", sPref.getFloat("font_size", 14) - 1);

            }
        });

        // TODO: add high contrast mode

        // high contrast button
        contrastButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                editor.putString("back_color", "#000000");  // background black
                editor.putString("font_color", "#008000");  // text green

                // set background and font color from preferences
                String backColor = sPref.getString("back_color", "#ffffff");
                int intBackColor = Color.parseColor(backColor);
                mainLayout.setBackgroundColor(intBackColor);

                String textColor = sPref.getString("font_color", "#000000");
                int intFontColor = Color.parseColor(textColor);
                settings.setTextColor(intFontColor);
            }
        });

    }
}
