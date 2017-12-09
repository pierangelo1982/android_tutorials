package com.example.pierangelo.a10animationmultiple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView tony = (ImageView) findViewById(R.id.tonyImageView);
        ImageView ironman = (ImageView) findViewById(R.id.ironmanImageView);

        tony.animate().translationXBy(-1000f)
                .translationYBy(-1000f)
                .setDuration(3000);

        ironman.animate().translationXBy(-1000f)
                .alphaBy(1f)
                .rotation(360f)
                .setDuration(3000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tony = (ImageView) findViewById(R.id.tonyImageView);
        ImageView ironman = (ImageView) findViewById(R.id.ironmanImageView);

        ironman.animate().translationX(1000f);
    }
}
