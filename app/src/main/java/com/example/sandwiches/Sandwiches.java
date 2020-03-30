package com.example.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Sandwiches extends AppCompatActivity {

    ArrayList<Sandwich> sandwiches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);

        sandwiches = new ArrayList<Sandwich>();
        sandwiches.add(new Sandwich(Integer.parseInt(getString(R.string.chacareroId)), getString(R.string.chacareroNombre), Integer.parseInt(getString(R.string.chacareroIdImagen)), getString(R.string.chacareroDescripcion), getString(R.string.chacareroPrecio)));
        sandwiches.add(new Sandwich(Integer.parseInt(getString(R.string.italianoId)), getString(R.string.italianoNombre), Integer.parseInt(getString(R.string.italianoIdImagen)), getString(R.string.italianoDescripcion), getString(R.string.italianoPrecio)));
        sandwiches.add(new Sandwich(Integer.parseInt(getString(R.string.diplomaticoId)), getString(R.string.diplomaticoNombre), Integer.parseInt(getString(R.string.diplomaticoIdImagen)), getString(R.string.diplomaticoDescripcion), getString(R.string.diplomaticoPrecio)));
        sandwiches.add(new Sandwich(Integer.parseInt(getString(R.string.alopobreId)), getString(R.string.alopobreNombre), Integer.parseInt(getString(R.string.alopobreIdImagen)), getString(R.string.alopobreDescripcion), getString(R.string.alopobrePrecio)));
        sandwiches.add(new Sandwich(Integer.parseInt(getString(R.string.barrosJarpaId)), getString(R.string.barrosJarpaNombre), Integer.parseInt(getString(R.string.barrosJarpaIdImagen)), getString(R.string.barrosJarpaDescripcion), getString(R.string.barrosJarpaPrecio)));


        Button botonChacarero = (Button) findViewById(R.id.botonChacarero);
        Button botonItaliano = (Button) findViewById(R.id.botonItaliano);
        Button botonDiplomatico = (Button) findViewById(R.id.botonDiplomatico);
        Button botonAlopobre = (Button) findViewById(R.id.botonAlopobre);
        Button botonBarrosJarpa = (Button) findViewById(R.id.botonBarrosjarpa);

        botonChacarero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandwiches.this, DetalleSandwich.class);
                intent.putExtra("sandwich", sandwiches.get(0));
                startActivity(intent);
            }
        });

        botonItaliano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandwiches.this, DetalleSandwich.class);
                intent.putExtra("sandwich", sandwiches.get(1));
                startActivity(intent);
            }
        });

        botonDiplomatico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandwiches.this, DetalleSandwich.class);
                intent.putExtra("sandwich", sandwiches.get(2));
                startActivity(intent);
            }
        });

        botonAlopobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandwiches.this, DetalleSandwich.class);
                intent.putExtra("sandwich", sandwiches.get(3));
                startActivity(intent);
            }
        });

        botonBarrosJarpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandwiches.this, DetalleSandwich.class);
                intent.putExtra("sandwich", sandwiches.get(4));
                startActivity(intent);
            }
        });
    }
}
