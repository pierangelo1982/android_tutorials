package com.example.pierangelo.a13sounddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void playAudio(View view) {

        // va spostato all'interno di onCreate, altrimenti il pause diventa stop.
        //mediaPlayer = MediaPlayer.create(this, R.raw.laugh);

        mediaPlayer.start();
    }

    public void pauseAudio(View view) {

        mediaPlayer.pause();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.laugh);

    }
}
