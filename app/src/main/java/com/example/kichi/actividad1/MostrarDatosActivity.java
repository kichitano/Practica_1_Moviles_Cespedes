package com.example.kichi.actividad1;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarDatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        Intent intent = getIntent();                                            //Obtenemos el intent
        Bundle extras = intent.getExtras();                                     //Obtenemos el conjunto de extras

        String numero = extras.getString("numero");                             //Obtenemos el extra numero
        String textoAzar = extras.getString("textoAzar");                       //Obtenemos el extra textoAzar

        TextView txtAzar = (TextView)findViewById(R.id.txtAzar);                //Buscamos el TextView por id del la caja de texto al azar
        TextView txtNumero = (TextView)findViewById(R.id.txtNumero);            //Buscamos el TextView por id de la caja de texto de numero
        txtNumero.setText(numero);                                              //Seteamos el numero
        txtAzar.setText(textoAzar);                                             //Seteamos el texto al azar

    }
}
