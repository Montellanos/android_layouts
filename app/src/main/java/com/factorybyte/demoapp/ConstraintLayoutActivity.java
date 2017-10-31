package com.factorybyte.demoapp;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class ConstraintLayoutActivity extends AppCompatActivity {


    RelativeLayout relative;
    TextView text;
    TableLayout numeral;

    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;


    String used = "uno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        int treinta = (int) (size.y * 0.3);

        int setenta = (int) (size.y * 0.7);

        relative = (RelativeLayout) findViewById(R.id.relative);

        text = (TextView) findViewById(R.id.text);

        text.setText("1");

        numeral = (TableLayout) findViewById(R.id.numeral);


        numeral.setMinimumHeight(setenta);
        numeral.setMinimumWidth(size.x);


        relative.setMinimumHeight(treinta);
        relative.setMinimumWidth(size.x);

        uno = (Button) findViewById(R.id.uno);

        uno.setTextSize(35);


        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);

        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);


        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = (Button) findViewById(R.id.nueve);

        int y = treinta / 2;
        int x = size.x / 2;

        text.measure(0, 0);
        int ax= text.getMeasuredWidth() / 2;
        int ay = text.getMeasuredHeight() / 2;

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)text.getLayoutParams();
        params.setMargins((x-ax), (y-ay), 0, 0);
        text.setLayoutParams(params);


        int button_heigth = setenta/ 3;
        int button_width = size.x / 3;

        uno.setHeight(button_heigth);
        uno.setWidth(button_width);




        dos.setHeight(button_heigth);
        dos.setWidth(button_width);
        tres.setHeight(button_heigth);
        tres.setWidth(button_width);


        cuatro.setHeight(button_heigth);
        cuatro.setWidth(button_width);
        cinco.setHeight(button_heigth);
        cinco.setWidth(button_width);
        seis.setHeight(button_heigth);
        seis.setWidth(button_width);



        siete.setHeight(button_heigth);
        siete.setWidth(button_width);
        ocho.setHeight(button_heigth);
        ocho.setWidth(button_width);
        nueve.setHeight(button_heigth);
        nueve.setWidth(button_width);


        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                used = "uno";
                uno.setTextSize(35);
                text.setText("1");
            }
        });


        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                dos.setTextSize(35);
                formatear("dos", "2");
            }
        });


        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                tres.setTextSize(35);
                formatear("tres", "3");
            }
        });


        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                used = "cuatro";
                cuatro.setTextSize(35);

                text.setText("4");
            }
        });


        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                used = "cinco";
                cinco.setTextSize(35);

                text.setText("5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                used = "seis";
                seis.setTextSize(35);

                text.setText("6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                used = "siete";
                siete.setTextSize(35);

                text.setText("7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                used = "ocho";
                ocho.setTextSize(35);

                text.setText("8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desactivar();
                used = "nueve";
                nueve.setTextSize(35);

                text.setText("9");
            }
        });


    }


    public void desactivar(){
        if (used == "uno"){
            uno.setTextSize(15);
        }else{
            if(used == "dos"){
                dos.setTextSize(15);
            }else{

                if(used == "tres"){
                    tres.setTextSize(15);
                }else{

                    if(used == "cuatro"){
                        cuatro.setTextSize(15);
                    }else{

                        if(used == "cinco"){
                            cinco.setTextSize(15);
                        }else{
                            if (used == "seis") {
                                seis.setTextSize(15);
                            }else{
                                if (used == "siete") {
                                    siete.setTextSize(15);
                                }else{
                                    if (used == "ocho") {
                                        ocho.setTextSize(15);
                                    }else{
                                        if (used == "nueve") {
                                            nueve.setTextSize(15);
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
    }



    public void formatear(String usar, String texto ){
        used = usar;
        text.setText(texto);
    }
}
