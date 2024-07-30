package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Kyabaatay extends AppCompatActivity {
    Button b38,b39,b40;
    ImageView i7;
    MediaPlayer mp3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyabaatay);
        i7=(ImageView)findViewById(R.id.imageView7);
        i7.setImageResource(R.drawable.kbhi);
        b38=(Button)findViewById(R.id.button38);
        b39=(Button)findViewById(R.id.button39);
        b40=(Button)findViewById(R.id.button40);
        mp3= MediaPlayer.create(this,R.raw.k);
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.pause();
            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean c=mp3.isPlaying();
                if(c)
                {
                    mp3.stop();
                }
                Intent u=new Intent(Kyabaatay.this,Mediaplayer.class);
                startActivity(u);
                finish();
            }
        });
    }
}