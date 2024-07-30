package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class Logout extends AppCompatActivity {
    Button b55,b56;
    ImageView i11;
    FirebaseAuth firebaseAuth;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        firebaseAuth=FirebaseAuth.getInstance();
        b55=(Button)findViewById(R.id.button55);
        b56=(Button)findViewById(R.id.button56);
        i11=(ImageView)findViewById(R.id.imageView11);
        i11.setImageResource(R.drawable.ty);
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signOut();
                finish();
                System.exit(0);
            }
        });
        b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e1=new Intent(Logout.this,Fifith.class);
                startActivity(e1);
                finish();
            }
        });

    }
}