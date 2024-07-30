package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Calculator extends AppCompatActivity {
    Button b20,b21,b22,b23,b24;
    EditText e3,e4;
    TextView t5;
    TextToSpeech ts;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b20=(Button)findViewById(R.id.button20);
        b21=(Button)findViewById(R.id.button21);
        b22=(Button)findViewById(R.id.button22);
        b23=(Button)findViewById(R.id.button23);
        b24=(Button)findViewById(R.id.button24);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        t5=(TextView)findViewById(R.id.textView5);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(1.0f);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                Float f1=Float.parseFloat(s3);
                Float f2=Float.parseFloat(s4);
                Float f3=f1+f2;
                String s5=Float.toString(f3);
                t5.setText(s5);
                ts.speak("The result is "+s5,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                Float f1=Float.parseFloat(s3);
                Float f2=Float.parseFloat(s4);
                Float f3=f1-f2;
                String s5=Float.toString(f3);
                t5.setText(s5);
                ts.speak("The result is "+s5,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                Float f1=Float.parseFloat(s3);
                Float f2=Float.parseFloat(s4);
                Float f3=f1*f2;
                String s5=Float.toString(f3);
                t5.setText(s5);
                ts.speak("The result is "+s5,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                Float f1=Float.parseFloat(s3);
                Float f2=Float.parseFloat(s4);
                Float f3=f1/f2;
                String s5=Float.toString(f3);
                t5.setText(s5);
                ts.speak("The result is "+s5,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Calculator.this,Fourth.class);
                startActivity(m);
                finish();
            }
        });
    }
}