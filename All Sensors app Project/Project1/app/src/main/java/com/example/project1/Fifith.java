package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class Fifith extends AppCompatActivity {
    Button b25,b47,b50,b51,b52;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifith);
        b25=(Button)findViewById(R.id.button25);
        b47=(Button)findViewById(R.id.button47);
        b50=(Button)findViewById(R.id.button50);
        b51=(Button)findViewById(R.id.button51);
        b52=(Button)findViewById(R.id.button52);

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(Fifith.this,Mediaplayer.class);
                startActivity(o);
                finish();
            }
        });
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y=new Intent(Fifith.this,Vibrate.class);
                startActivity(y);
                finish();
            }
        });
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(Fifith.this,Speak.class);
                startActivity(a1);
                finish();
            }
        });
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c1=new Intent(Fifith.this,Fourth.class);
                startActivity(c1);
                finish();
            }
        });
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d1=new Intent(Fifith.this,Logout.class);
                startActivity(d1);
                finish();
            }
        });
    }
}