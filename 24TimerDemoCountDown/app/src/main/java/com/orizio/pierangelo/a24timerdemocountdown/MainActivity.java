package com.orizio.pierangelo.a24timerdemocountdown;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                Log.i("Secondi Mancanti:", String.valueOf(millisUntilFinished / 1000));

            }

            @Override
            public void onFinish() {

                Log.i("Fine!", "countdown ultimato");

            }
        }.start();

    }
}
