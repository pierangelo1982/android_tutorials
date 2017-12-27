package com.orizio.pierangelo.a17listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        final ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Pierangelo");
        myFamily.add("Marco");
        myFamily.add("Donatella");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        listView.setAdapter(arrayAdapter);
    }
}
