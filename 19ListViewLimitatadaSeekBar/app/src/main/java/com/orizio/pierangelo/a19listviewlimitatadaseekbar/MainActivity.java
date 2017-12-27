package com.orizio.pierangelo.a19listviewlimitatadaseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView itemListView;
    TextView totalItemVisualizedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar filterSeekBar = (SeekBar)findViewById(R.id.filterSeekBar);
        itemListView = (ListView) findViewById(R.id.itemListView);
        totalItemVisualizedText = (TextView)findViewById(R.id.totalItemVisualizedText);

        int max = setItemList().size();
        Log.i("totale:", Integer.toString(max));
        filterSeekBar.setMax(max);
        filterSeekBar.setProgress(max); //faccio partire la progress bar dalla metà.

        setItemListView(setItemList(), max);

        totalItemVisualizedText.setText("Show: " + max);


        filterSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                Log.i("posizione:", String.valueOf(progress));

                setItemListView(setItemList(), progress);

                totalItemVisualizedText.setText("Show: " + Integer.toString(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    
    // genero ArrayList, cosi poi posso mandare il totale al filterSeekBar.setMax
    // e la lista alla listview;
    public ArrayList<String> setItemList() {
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            arrayList.add("item " + i);
        }
        return arrayList;
    }


    // genero ListView
    public void setItemListView(ArrayList<String> arrayList, int maxToShow) {

        // creo un array che filtra l'array totale per il numero fornito dalla SeekBar
        ArrayList<String> limitArrayList = new ArrayList<>();

        for (int i = 0; i < maxToShow; i++) {

            limitArrayList.add(arrayList.get(i));

        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, limitArrayList);

        itemListView.setAdapter(arrayAdapter);

    }
}
