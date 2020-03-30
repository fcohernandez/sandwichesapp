package com.example.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetalleSandwich extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_sandwich);

        Intent intent = getIntent();
        Sandwich sandwich = (Sandwich) intent.getSerializableExtra("sandwich");

        getSupportActionBar().setTitle(sandwich.getNombre());

        ImageView imagen = (ImageView) findViewById(R.id.imagen);

        TextView textoNombre = (TextView) findViewById(R.id.nombre);
        TextView textoDescripcion = (TextView) findViewById(R.id.descripcion);
        TextView textoPrecio = (TextView) findViewById(R.id.precio);

        textoNombre.setText(sandwich.getNombre());
        textoDescripcion.setText(sandwich.getDescripcion());
        textoPrecio.setText(sandwich.getPrecio());

        switch (sandwich.getId()){
            case 0:
                imagen.setImageResource(R.drawable.chacarero);
                break;
            case 1:
                imagen.setImageResource(R.drawable.italiano);
                break;
            case 2:
                imagen.setImageResource(R.drawable.diplomatico);
                break;
            case 3:
                imagen.setImageResource(R.drawable.alopobre);
                break;
            case 4:
                imagen.setImageResource(R.drawable.barrosjarpa);
                break;
            default:
                break;
        }


    }
}
