package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton botonPantalla1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonPantalla1 = (ImageButton) findViewById(R.id.imageButton);

        botonPantalla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPantallaTabla();
            }
        });
    }
    public void abrirPantallaTabla(){
        Intent intenta = new Intent(this,PantallaTabla.class);

        startActivity(intenta);
    }


}
