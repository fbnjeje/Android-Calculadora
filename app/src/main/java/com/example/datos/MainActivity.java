package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Operacional;

    TextView Opcion;

    Button Test;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Operacional = (EditText)findViewById(R.id.InputOperacion);

        Opcion = (TextView) findViewById(R.id.Opcional);

        Test = (Button) findViewById(R.id.test);

        Operacional.setOnClickListener(this);
    }

    //Metodo Boton El boton siguiente

    public void Siguiente(View view){
        Intent siguiente = new Intent(this,Resultado.class);
        startActivity(siguiente);
    }

    @Override
    public void onClick(View view) {
        float Operacion;


        Operacion = Float.parseFloat(Operacional.getText().toString());

        switch (view.getId()){

            case    R.id.test:
                Opcion.setText("El numero Seleccionado es: "+ Operacion);
        }
    }
}