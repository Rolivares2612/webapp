package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {
ImageButton user;
ImageButton rewards;
ImageButton mensaje;
ImageButton compra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        user = (ImageButton) findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(i);
            }
        });
        rewards = (ImageButton) findViewById(R.id.rewards);
        rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(i);
            }
        });
        mensaje = (ImageButton) findViewById(R.id.mensaje);
        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(i);
            }
        });
        compra = (ImageButton) findViewById(R.id.compra);
        compra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(i);
            }
        });

    }
}