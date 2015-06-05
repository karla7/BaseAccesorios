package com.example.macedonio.baseaccesorios;

/**
 * Created by macedonio on 28/05/2015.
 */
public class Modelo {

    private String id_accesorio;
    private String nombre;
    private String color;
    private String tipo;


    public String getId_ACCESORIO() {
        return id_accesorio;
    }

    public String getNOMBRE() {
        return nombre;
    }

    public String getCOLOR() {
        return color;
    }

    public String getTIPO() {
        return tipo;
    }



    public Modelo(String id_accesorio, String nombre , String color, String tipo){
        this.id_accesorio = id_accesorio;
        this.nombre=nombre;
        this.color=color;
        this.tipo=tipo;

    }

}


