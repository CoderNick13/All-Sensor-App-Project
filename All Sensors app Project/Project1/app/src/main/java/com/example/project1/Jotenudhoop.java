package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Jotenudhoop extends AppCompatActivity {
    Button b44,b45,b46;
    ImageView i9;
    MediaPlayer mp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jotenudhoop);
        i9=(ImageView)findViewById(R.id.imageView9);
        i9.setImageResource(R.drawable.dhoop);
        b44=(Button)findViewById(R.id.button44);
        b45=(Button)findViewById(R.id.button45);
        b46=(Button)findViewById(R.id.button46);
        mp5= MediaPlayer.create(this,R.raw.j);
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
            }
        });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.pause();
            }
        });
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean e=mp5.isPlaying();
                if(e)
                {
                    mp5.stop();
                }
                Intent w=new Intent(Jotenudhoop.this,Mediaplayer.class);
                startActivity(w);
                finish();
            }
        });
    }
}