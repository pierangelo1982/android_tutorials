package com.example.pierangelo.a09fadebetweentwoimagewithbackinitialstatus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView tony = (ImageView) findViewById(R.id.tonyImageView);
        ImageView ironman = (ImageView) findViewById(R.id.ironmanImageView);

        if (tony.getAlpha()==1) {

            tony.animate().alpha(0f).setDuration(3000);

            ironman.animate().alpha(1f).setDuration(3000);

        } else {

            tony.animate().alpha(1f).setDuration(3000);

            ironman.animate().alpha(0f).setDuration(3000);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
