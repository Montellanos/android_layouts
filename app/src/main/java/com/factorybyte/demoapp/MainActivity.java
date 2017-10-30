package com.factorybyte.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button linner, table, relative, grid, constraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linner = (Button) findViewById(R.id.linner);

        table = (Button) findViewById(R.id.table);
        relative = (Button) findViewById(R.id.relative);

        grid = (Button) findViewById(R.id.grid);

        constraint = (Button) findViewById(R.id.constraint);


        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =  new Intent(v.getContext(), GridLayoutActivity.class);
                startActivity(inten);
            }
        });

        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =  new Intent(v.getContext(), ConstraintLayoutActivity.class);
                startActivity(inten);
            }
        });



        linner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(v.getContext(), LinerLayoutActivity.class);
                startActivity(inten);

            }


        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View t) {
                Intent inten = new Intent(t.getContext(), TableLayoutActivity.class);
                startActivity(inten);

            }

        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View t) {
                Intent inten = new Intent(t.getContext(), RelativeLayoutActivity.class);
                startActivity(inten);

            }

        });



    }





}
