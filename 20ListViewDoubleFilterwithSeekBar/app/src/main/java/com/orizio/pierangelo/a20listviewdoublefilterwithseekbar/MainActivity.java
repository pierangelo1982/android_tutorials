package com.orizio.pierangelo.a20listviewdoublefilterwithseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBarStart;
    SeekBar seekBarEnd;
    ListView listView;
    TextView textFilter;

    int startPoint;
    int endPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarStart = (SeekBar)findViewById(R.id.seekBarStart);
        seekBarEnd = (SeekBar)findViewById(R.id.seekBarEnd);
        listView = (ListView)findViewById(R.id.listView);
        textFilter = (TextView)findViewById(R.id.textFilter);

        int max = setItemList().size();
        seekBarStart.setMax(max);
        seekBarStart.setProgress(0);

        seekBarEnd.setMax(max);
        seekBarEnd.setProgress(max);

        startPoint = 0;
        endPoint = max;

        setItemListView(setItemList(), startPoint, endPoint);

        textFilter.setText("From: " + Integer.toString(startPoint) + " To: " + Integer.toString(endPoint));

        seekBarStart.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                startPoint = progress;
                Log.i("start:", String.valueOf(startPoint));
                Log.i("end:", String.valueOf(endPoint));

                setItemListView(setItemList(), startPoint, endPoint);

                textFilter.setText("From: " + Integer.toString(startPoint) + " To: " + Integer.toString(endPoint));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seekBarEnd.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                endPoint = progress;
                Log.i("start:", String.valueOf(startPoint));
                Log.i("end:", String.valueOf(endPoint));

                setItemListView(setItemList(), startPoint, endPoint);

                textFilter.setText("From: " + Integer.toString(startPoint) + " To: " + Integer.toString(endPoint));

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
    public ArrayList<String> setItemList() {
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            arrayList.add("item " + i);
        }
        return arrayList;
    }


    // genero ListView
    public void setItemListView(ArrayList<String> arrayList, int startPoint, int endPoint) {

        // creo un array che filtra l'array totale per il numero fornito dalla SeekBar
        ArrayList<String> limitArrayList = new ArrayList<>();

        for (int i = startPoint; i < endPoint; i++) {
            limitArrayList.add(arrayList.get(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, limitArrayList);
        listView.setAdapter(arrayAdapter);

    }

}
