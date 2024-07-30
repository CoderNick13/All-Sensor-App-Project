package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Baarishein extends AppCompatActivity {
    Button b35,b36,b37;
    ImageView i6;
    MediaPlayer mp2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baarishein);
        i6=(ImageView)findViewById(R.id.imageView6);
        i6.setImageResource(R.drawable.bari);
        b35=(Button)findViewById(R.id.button35);
        b36=(Button)findViewById(R.id.button36);
        b37=(Button)findViewById(R.id.button37);
        mp2= MediaPlayer.create(this,R.raw.b);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.pause();
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean b=mp2.isPlaying();
                if(b)
                {
                    mp2.stop();
                }
                Intent s=new Intent(Baarishein.this,Mediaplayer.class);
                startActivity(s);
                finish();
            }
        });

    }
}