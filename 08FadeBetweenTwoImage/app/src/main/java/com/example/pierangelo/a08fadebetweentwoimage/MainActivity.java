package com.example.pierangelo.a08fadebetweentwoimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView tony = (ImageView) findViewById(R.id.tonyImageView);

        tony.animate().alpha(0f).setDuration(3000);

        ImageView ironman = (ImageView) findViewById(R.id.ironmanImageView);

        ironman.animate().alpha(1f).setDuration(3000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
