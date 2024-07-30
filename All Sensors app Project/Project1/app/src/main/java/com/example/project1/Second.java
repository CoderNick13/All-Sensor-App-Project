package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.lang.reflect.Field;

public class Second extends AppCompatActivity {
    Button b3,b4;
    EditText e3,e4;
    ProgressBar p2;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e4.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        p2=(ProgressBar)findViewById(R.id.progressBar2);
        firebaseAuth=FirebaseAuth.getInstance();
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(Second.this,MainActivity.class);
                startActivity(c);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                if(s3.isEmpty())
                {
                    e3.setError("Fill email");
                    return;
                }
                else
                {
                    if(s4.isEmpty())
                    {
                        e4.setError("Fill password");
                        return;
                    }
                    else
                    {
                        p2.setVisibility(View.VISIBLE);
                        firebaseAuth.createUserWithEmailAndPassword(s3,s4).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                {
                                    p2.setVisibility(View.INVISIBLE);
                                    Toast.makeText(Second.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                    Intent d=new Intent(Second.this,MainActivity.class);
                                    startActivity(d);
                                    finish();
                                }
                                else
                                {
                                    p2.setVisibility(View.INVISIBLE);
                                    Toast.makeText(Second.this, "Registration not done", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }

                }
            }
        });
    }
}