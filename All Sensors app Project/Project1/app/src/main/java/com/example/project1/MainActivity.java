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

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    ProgressBar p1;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        p1=(ProgressBar)findViewById(R.id.progressBar1);
        firebaseAuth=FirebaseAuth.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty())
                {
                    e1.setError("Fill email");
                    return;
                }
                else
                {
                    if(s2.isEmpty())
                    {
                        e2.setError("Fill password");
                        return;
                    }
                    else
                    {
                        p1.setVisibility(View.VISIBLE);
                        firebaseAuth.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                {
                                    p1.setVisibility(View.INVISIBLE);
                                    Toast.makeText(MainActivity.this, "Login sucessful", Toast.LENGTH_SHORT).show();
                                    Intent a=new Intent(MainActivity.this,ThirdWelcome.class);
                                    startActivity(a);
                                    finish();
                                }
                                else
                                {
                                    p1.setVisibility(View.INVISIBLE);
                                    Toast.makeText(MainActivity.this, "Login not done", Toast.LENGTH_SHORT).show();
                                }
                            }

                        });
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Redirecting to Registration page", Toast.LENGTH_SHORT).show();
                Intent b=new Intent(MainActivity.this,Second.class);
                startActivity(b);
                finish();
            }
        });
    }
}