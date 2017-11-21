package com.example.pierangelo.a06_indovinanumerorandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void messaggio(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void indovina(View view) {

        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);

        int insertNumber = Integer.parseInt(numberEditText.getText().toString());

        if (insertNumber < randomNumber) {

            messaggio("hai inserito un numero minore");

        } else if (insertNumber > randomNumber) {

            messaggio("hai inserito un numero maggiore");

        } else {

            messaggio("indovinato! Adesso indovina il prossimo numero");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }
}
