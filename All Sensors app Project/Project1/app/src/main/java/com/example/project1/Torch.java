package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Torch extends AppCompatActivity {
    ImageView i2;
    Button b11,b12,b13;
    CameraManager cm;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);
        i2=(ImageView)findViewById(R.id.imageView2);
        i2.setImageResource(R.drawable.torch);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        cm=(CameraManager)getSystemService(CAMERA_SERVICE);
        b11.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                try {
                    String id=cm.getCameraIdList()[0];
                    cm.setTorchMode(id,true);
                }
                catch (CameraAccessException e)
                {

                }

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                try {
                    String id=cm.getCameraIdList()[0];
                    cm.setTorchMode(id,false);
                }
                catch (CameraAccessException e)
                {

                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(Torch.this,Fourth.class);
                startActivity(g);
                finish();
            }
        });




    }
}