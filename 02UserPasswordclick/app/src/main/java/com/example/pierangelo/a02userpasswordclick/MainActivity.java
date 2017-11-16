package com.example.pierangelo.a02userpasswordclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginClicked(View view) {

        EditText username = (EditText) findViewById(R.id.editUsername);
        EditText password = (EditText) findViewById(R.id.editPassword);

        Log.i("info:", username.getText().toString());
        Log.i("info:", password.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
