package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Maahi extends AppCompatActivity {
     ImageView i5;
     Button b32,b33,b34;
     MediaPlayer mp1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maahi);
        i5=(ImageView)findViewById(R.id.imageView5);
        i5.setImageResource(R.drawable.maahi);
        b32=(Button)findViewById(R.id.button32);
        b33=(Button)findViewById(R.id.button33);
        b34=(Button)findViewById(R.id.button34);
        mp1= MediaPlayer.create(this,R.raw.m);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.pause();
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean a=mp1.isPlaying();
                if(a)
                {
                    mp1.stop();
                }
                Intent q=new Intent(Maahi.this,Mediaplayer.class);
                startActivity(q);
                finish();
            }
        });

    }
}