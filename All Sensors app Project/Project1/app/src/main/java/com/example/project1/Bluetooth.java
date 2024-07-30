package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Bluetooth extends AppCompatActivity {
    ImageView i3;
    Button b14,b15,b16;
    BluetoothAdapter ba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        i3=(ImageView)findViewById(R.id.imageView3);
        i3.setImageResource(R.drawable.bt);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        ba=BluetoothAdapter.getDefaultAdapter();
        b14.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                ba.enable();
                Toast.makeText(Bluetooth.this, "Bluetooth turned ON", Toast.LENGTH_SHORT).show();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                ba.disable();
                Toast.makeText(Bluetooth.this, "Bluetooth turned OFF", Toast.LENGTH_SHORT).show();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Bluetooth.this,Fourth.class);
                startActivity(i);
                finish();
            }
        });

    }
}