package com.example.v15ion_19;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


@TargetApi(Build.VERSION_CODES.DONUT)
public class MainActivity extends Activity implements OnInitListener {
    private TextToSpeech repeatTTS;
    Button btnspeakout;
    public static EditText edtTexttoSpeak;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speakout);
        btnspeakout = findViewById(R.id.btnspeakout);
        edtTexttoSpeak = findViewById(R.id.edtTexttoSpeak);
        repeatTTS = new TextToSpeech(this, this);

        /*
        btnspeakout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repeatTTS.speak(edtTexttoSpeak.getText().toString(),
                        TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        */

        btnspeakout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeDashboard.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onInit(int arg0) {
        // TODO Auto-generated method stub
    }
}



