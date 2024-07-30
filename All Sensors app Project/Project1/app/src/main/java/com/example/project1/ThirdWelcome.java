package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ThirdWelcome extends AppCompatActivity {
    ImageView i1;
    Button b5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_welcome);
        i1=(ImageView)findViewById(R.id.imageView1);
        i1.setImageResource(R.drawable.w);
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(ThirdWelcome.this,Fourth.class);
                startActivity(e);
                finish();
            }
        });

    }
}