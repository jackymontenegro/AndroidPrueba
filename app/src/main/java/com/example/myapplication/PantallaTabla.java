package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PantallaTabla extends AppCompatActivity {


    String[] array_letras={
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "a","b","c","d","e","f",
            "5abcdef","b","c","d","e","f"
    };

    List<String> lstSource = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_tabla);

        llenarLista();
        GridView gricv = (GridView) findViewById(R.id.tablita);
        GridViewAdapter adapt = new GridViewAdapter(lstSource,this);
        gricv.setAdapter(adapt);
    }

    private void llenarLista() {
        for(String i : array_letras){
            lstSource.add(i);
        }
    }
}
