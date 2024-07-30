package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class Speak extends AppCompatActivity {
    TextToSpeech ts2;
    EditText e5;
    Button b53,b54;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);
        b53=(Button)findViewById(R.id.button53);
        b54=(Button)findViewById(R.id.button54);
        e5=(EditText)findViewById(R.id.editText5);
        ts2=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts2.setLanguage(Locale.ENGLISH);
                ts2.setSpeechRate(1.0f);
            }
        });
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=e5.getText().toString();
                ts2.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b1=new Intent(Speak.this,Fifith.class);
                startActivity(b1);
                finish();
            }
        });
    }
}