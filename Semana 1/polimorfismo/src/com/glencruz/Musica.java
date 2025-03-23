package com.glencruz;

public class Musica extends Servicio {
    public Musica(int monto, String nombre){
        super(monto,nombre);
    }

    @Override
    public String mostrar(){
        return "Pagaste por tu suscripcion de "+this.getClass().getSimpleName()+" a "+nombre+" un total de: $"+monto;
    }
}
