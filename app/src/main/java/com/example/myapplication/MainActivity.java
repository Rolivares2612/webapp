package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresar=(Button)findViewById(R.id.ingresar);
        ingresar.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                Intent i = new Intent( MainActivity.this, MainActivity3.class);
                startActivity(i);
            }

        });
    }
}