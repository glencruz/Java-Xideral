package com.glencruz;

public abstract class Servicio {
    int monto;
    String nombre;

    public Servicio(int monto, String nombre){
        this.monto = monto;
        this.nombre = nombre;
    }


    public abstract String mostrar();

}


