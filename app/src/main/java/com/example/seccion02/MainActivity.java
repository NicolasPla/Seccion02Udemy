package com.example.seccion02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //Datos a mostrar
        names = new ArrayList<String>();
        names.add("Juan");
        names.add("Nicolas");
        names.add("Santiago");
        names.add("Joaquin");
        names.add("Juan");
        names.add("Nicolas");
        names.add("Santiago");
        names.add("Joaquin");
        names.add("Juan");
        names.add("Nicolas");
        names.add("Santiago");
        names.add("Joaquin");

        //Adaptador (Forma visual de mostrar datos)

       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, names);

        //Enlazamos el adaptador con nuestro listView
       // listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked: " + names.get(position), Toast.LENGTH_LONG).show();
            }
        });

        //Enlazamos con nuestro adaptador personalizado
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listView.setAdapter(myAdapter);

    }
}

