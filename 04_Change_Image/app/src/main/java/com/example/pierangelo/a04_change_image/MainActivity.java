package com.example.pierangelo.a04_change_image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImage(View view) {
        ImageView img = (ImageView) findViewById(R.id.catImageView);
        img.setImageResource(R.drawable.lion);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
