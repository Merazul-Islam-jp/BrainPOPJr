package com.merazjava.brainpopjr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Button_1,Button_2,Button_3,Button_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button_1=findViewById(R.id.Button_1);
        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1=new Intent(MainActivity.this,Animal.class);
                startActivity(intent_1);

            }
        });

        Button_2=findViewById(R.id.Button_2);
        Button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2=new Intent(MainActivity.this,Bird.class);
                startActivity(intent_2);
            }
        });

        Button_3=findViewById(R.id.Button_3);
        Button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3=new Intent(MainActivity.this,flower.class);
                startActivity(intent_3);
            }
        });

        Button_4=findViewById(R.id.Button_4);
        Button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_4=new Intent(MainActivity.this,body.class);
                startActivity(intent_4);
            }
        });
    }
}