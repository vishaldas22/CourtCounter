package com.example.vishal.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int increment = 0;
    int increment1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button threePt = (Button) findViewById(R.id.pt1);
        Button threePt1 = (Button) findViewById(R.id.pt2);
        Button twoPt = (Button) findViewById(R.id.pt3);
        Button twoPt1 = (Button) findViewById(R.id.pt4);
        Button free = (Button) findViewById(R.id.pt5);
        Button free1 = (Button) findViewById(R.id.pt6);
        Button reset = (Button) findViewById(R.id.reset) ;

        threePt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment = increment + 3;
                display(increment);
            }
        });

        threePt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment1 = increment1 + 3;
                display1(increment1);
            }
        });

        twoPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment = increment + 2;
                display(increment);
            }
        });

        twoPt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment1 = increment1 + 2;
                display1(increment1);
            }
        });

        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment = increment + 1;
                display(increment);
            }
        });

        free1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment1 = increment1 + 1;
                display1(increment1);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment = 0;
                increment1 = 0;
                display(increment);
                display1(increment1);
            }
        });
    }



    public void display(int number){
        TextView textView = findViewById(R.id.count1);
        textView.setText("" +number);
    }

    public void display1(int number){
        TextView textView = findViewById(R.id.count2);
        textView.setText("" +number);
    }
}
