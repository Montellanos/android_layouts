package com.factorybyte.demoapp;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.Button;
import android.widget.TextView;

public class ConstraintLayoutActivity extends AppCompatActivity {

    Button adaptado;
    TextView numeral;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        int treinta = (int) (size.y * 0.3);

        int setenta = (int) (size.y * 0.7);


        numeral = (TextView) findViewById(R.id.numeral);

        numeral.setHeight(treinta);








    }
}
