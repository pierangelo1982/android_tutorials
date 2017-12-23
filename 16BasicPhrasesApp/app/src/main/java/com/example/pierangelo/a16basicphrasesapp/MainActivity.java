package com.example.pierangelo.a16basicphrasesapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {

        int id = view.getId(); //ottengo id sistema
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id); // converto id sistema in id dell'oggeto, stringa

        int resourceId = view.getResources().getIdentifier(ourId, "raw", "com.example.pierangelo.a16basicphrasesapp"); // passo singolo riferimento presente in cartella raw

        //MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();

        Log.i("button tapped", ourId);

    }

}
