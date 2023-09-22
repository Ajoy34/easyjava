package com.ajoy.easyjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {
     Button but1,but2,but3,but4,but5,but6,but7,but8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        but5=findViewById(R.id.but5);
        but6=findViewById(R.id.but6);
        but7=findViewById(R.id.but7);
        but8=findViewById(R.id.but8);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent k=new Intent(Second.this,Firstly.class);
               startActivity(k);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,secondly.class);
                startActivity(k);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,thirdly.class);
                startActivity(k);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,fourly.class);
                startActivity(k);
            }
        });


        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,fively.class);
                startActivity(k);
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,sixly.class);
                startActivity(k);
            }
        });


        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,sevenly.class);
                startActivity(k);
            }
        });


        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,eightlt.class);
                startActivity(k);
            }
        });



    }
}