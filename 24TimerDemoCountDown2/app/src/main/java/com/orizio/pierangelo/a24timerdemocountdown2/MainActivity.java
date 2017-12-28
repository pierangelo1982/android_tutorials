package com.orizio.pierangelo.a24timerdemocountdown2;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView countDownNumbersText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDownNumbersText = (TextView)findViewById(R.id.countDownNumbersText);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                countDownNumbersText.setText(String.valueOf(millisUntilFinished / 1000));

            }

            @Override
            public void onFinish() {

                countDownNumbersText.setText("FINE");

            }
        }.start();
    }
}
