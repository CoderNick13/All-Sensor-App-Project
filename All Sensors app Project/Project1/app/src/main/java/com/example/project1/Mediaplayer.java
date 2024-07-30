package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mediaplayer extends AppCompatActivity {
    Button b26,b27,b28,b29,b30,b31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);
        b26=(Button)findViewById(R.id.button26);
        b27=(Button)findViewById(R.id.button27);
        b28=(Button)findViewById(R.id.button28);
        b29=(Button)findViewById(R.id.button29);
        b30=(Button)findViewById(R.id.button30);
        b31=(Button)findViewById(R.id.button31);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Mediaplayer.this,Maahi.class);
                startActivity(p);
                finish();
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(Mediaplayer.this,Baarishein.class);
                startActivity(r);
                finish();
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(Mediaplayer.this,Kyabaatay.class);
                startActivity(t);
                finish();
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v=new Intent(Mediaplayer.this,Dilgalti.class);
                startActivity(v);
                finish();
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w=new Intent(Mediaplayer.this,Jotenudhoop.class);
                startActivity(w);
                finish();
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(Mediaplayer.this,Fifith.class);
                startActivity(x);
                finish();
            }
        });

    }
}