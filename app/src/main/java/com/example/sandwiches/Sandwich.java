package com.example.sandwiches;

import java.io.Serializable;

public class Sandwich implements Serializable {
    private int id;
    private String nombre;
    private int idImagen;
    private String descripcion;
    private String precio;

    public Sandwich(int id, String nombre, int idImagen, String descripcion, String precio){
        this.id = id;
        this.nombre = nombre;
        this.idImagen = idImagen;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getIdImagen(){
        return this.idImagen;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public String getPrecio(){
        return this.precio;
    }
}
