package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Vibrate extends AppCompatActivity {
    ImageView i10;
    Button b48,b49;
    Vibrator v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate);
        i10=(ImageView)findViewById(R.id.imageView10);
        i10.setImageResource(R.drawable.vib);
        b48=(Button)findViewById(R.id.button48);
        b49=(Button)findViewById(R.id.button49);
        v1=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1.vibrate(3000);
            }
        });
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z=new Intent(Vibrate.this,Fifith.class);
                startActivity(z);
                finish();
            }
        });

    }
}