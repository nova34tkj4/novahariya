package com.example.novahariya.bayarbukutaunannova;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Pilihanbuku extends AppCompatActivity {

    Button btnceksaldo, btntarik, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanbuku);

        btnceksaldo = (Button) findViewById(R.id.btnceksaldo);
        btntarik = (Button) findViewById(R.id.btntarik);
        btnexit = (Button) findViewById(R.id.btnexit);

        btntarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbuku.this, Penarikan.class);
                startActivity(i);
            }
        });
        btnceksaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pilihanbuku.this, cek.class);
                startActivity(i);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.exit(0);
            }
        });
    }
}