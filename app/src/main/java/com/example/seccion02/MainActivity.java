package com.example.seccion02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    listView = findViewById(R.id.listView);

    //Datos a mostrar
    List<String> names = new ArrayList<String>();
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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, names);

        //Enlazamos el adaptador con nuestro listView
        listView.setAdapter(adapter);


    }
}
