package com.example.clase02_listados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvListado;
    ArrayList alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        lvListado = findViewById(R.id.lvAlumnos);
        //
        //datos
        alumnos = new ArrayList<String>();
        alumnos.add("Elvis");
        alumnos.add("Carlos");
        alumnos.add("Manuel");
        alumnos.add("Cesar Machaca");


        //Creamos adaptador que usa los datos del Array Alumnos
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alumnos);
        //Asignamos el adaptador al listado
        lvListado.setAdapter(adapter);

        //
        lvListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                Toast.makeText(MainActivity.this, String.valueOf(position),
                        Toast.LENGTH_SHORT).show();


            }
        });


    }
}