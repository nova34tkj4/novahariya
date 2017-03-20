package com.example.novahariya.bayarbukutaunannova;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class cek extends AppCompatActivity {

    int tab = 300000;
    TextView editcek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek);
        editcek = (TextView) findViewById(R.id.textcek);
        editcek.setText("Tagihan Anda Rp. " + String.valueOf(tab));
    }
}


