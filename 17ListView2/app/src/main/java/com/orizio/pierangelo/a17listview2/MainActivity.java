package com.orizio.pierangelo.a17listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView cousinsListView = (ListView)findViewById(R.id.cousinsListView);

        final ArrayList<String> myCousins = new ArrayList<String>(asList("Monica", "Bruno", "Maddalena", "Raffaele", "Gioele"));

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myCousins);

        cousinsListView.setAdapter(arrayAdapter);

        cousinsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Ciao " + myCousins.get(position), Toast.LENGTH_SHORT).show();
                
            }
        });

    }
}
