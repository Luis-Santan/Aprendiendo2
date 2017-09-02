package com.example.lenovo.aprendiendo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView list = (ListView)findViewById(R.id.listview);

        List<String> lista = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            lista.add(Integer.toString(i+1));

        }
        list .setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,lista));
    }
}
