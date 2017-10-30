package com.factorybyte.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LinerLayoutActivity extends AppCompatActivity {
    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    TextView mitexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_layout);


        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = (Button) findViewById(R.id.nueve);
        mitexto = (TextView) findViewById(R.id.mitexto);


        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mitexto.setText("9");
            }
        });
    }
}
