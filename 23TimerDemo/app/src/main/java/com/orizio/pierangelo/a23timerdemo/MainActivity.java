package com.orizio.pierangelo.a23timerdemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textNumber = (TextView)findViewById(R.id.numberText);

        number = 0;

        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                // Insert code to be run every second

                Log.i("Runnable has run!", "a second must have passed...");

                handler.postDelayed(this, 1000);

                number++;

                textNumber.setText(Integer.toString(number));


            }
        };

        handler.post(run);
    }
}
