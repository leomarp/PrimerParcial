package com.pucmm.primerparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends ListActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
         String[] Android= new String[]{"1","2","","3"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.activity_main,R.id.text, Android);
        setListAdapter(arrayAdapter);
    //para que hacer que sea crick
        ListView listView= getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Snackbar.make(view,":", Snackbar.LEN);
            }
        });
    }
}