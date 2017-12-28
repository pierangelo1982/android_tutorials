package com.orizio.pierangelo.a23timerdemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView timerNumbers;

    Handler handler;
    Runnable runnable;

    int numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerNumbers = (TextView)findViewById(R.id.numberText);

        numbers = 0;

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                numbers++;

                timerNumbers.setText(Integer.toString(numbers));

                handler.postDelayed(runnable, 1000);

            }
        };

    }

    public void startTimer(View view) {

        timerNumbers.setText(Integer.toString(numbers));

        handler.post(runnable);
    }

    public void stopTimer(View view) {

        handler.removeCallbacksAndMessages(null);

        timerNumbers.setText(Integer.toString(numbers));

        numbers = 0;

    }

    public void pauseTimer(View view) {

        handler.removeCallbacksAndMessages(null);


    }
}
