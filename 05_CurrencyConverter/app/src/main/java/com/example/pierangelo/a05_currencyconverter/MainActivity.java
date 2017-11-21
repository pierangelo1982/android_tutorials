package com.example.pierangelo.a05_currencyconverter;

import android.net.ParseException;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText  dollarAmountEditText = (EditText) findViewById(R.id.currencyDollarEditText);

        Double dollarAmmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        Double euroAmountDouble = dollarAmmountDouble * 0.84;

        Toast.makeText(this, "€." + String.format("%.2f", euroAmountDouble), Toast.LENGTH_SHORT).show();

        Log.i("Dollars:", dollarAmountEditText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
