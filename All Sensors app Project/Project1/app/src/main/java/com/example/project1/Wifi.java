package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Wifi extends AppCompatActivity {
    ImageView i4;
    Button b17,b18,b19;
    WifiManager wm;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        i4=(ImageView)findViewById(R.id.imageView4);
        i4.setImageResource(R.drawable.wifiii);
        wm=(WifiManager)getSystemService(WIFI_SERVICE);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wm.setWifiEnabled(true);
                Toast.makeText(Wifi.this, "Wifi turned ON", Toast.LENGTH_SHORT).show();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wm.setWifiEnabled(false);
                Toast.makeText(Wifi.this, "Wifi turned OFF", Toast.LENGTH_SHORT).show();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Wifi.this,Fourth.class);
                startActivity(k);
                finish();
            }
        });
    }
}