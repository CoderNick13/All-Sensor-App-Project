package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dilgalti extends AppCompatActivity {
    Button b41,b42,b43;
    ImageView i8;
    MediaPlayer mp4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilgalti);
        i8=(ImageView)findViewById(R.id.imageView8);
        i8.setImageResource(R.drawable.dil);
        b41=(Button)findViewById(R.id.button41);
        b42=(Button)findViewById(R.id.button42);
        b43=(Button)findViewById(R.id.button43);
        mp4= MediaPlayer.create(this,R.raw.d);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.pause();
            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean d=mp4.isPlaying();
                if(d)
                {
                    mp4.stop();
                }
                Intent v=new Intent(Dilgalti.this,Mediaplayer.class);
                startActivity(v);
                finish();
            }
        });
    }
}