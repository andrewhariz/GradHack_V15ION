package com.example.v15ion_19;

import android.annotation.TargetApi;
import android.app.Activity;
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
    EditText edtTexttoSpeak;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speakout);
        btnspeakout = (Button) findViewById(R.id.btnspeakout);
        edtTexttoSpeak = (EditText) findViewById(R.id.edtTexttoSpeak);
        repeatTTS = new TextToSpeech(this, this);
        btnspeakout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repeatTTS.speak(edtTexttoSpeak.getText().toString(),
                        TextToSpeech.QUEUE_FLUSH, null);

            }
        });
    }

    @Override
    public void onInit(int arg0) {
        // TODO Auto-generated method stub
    }
}



