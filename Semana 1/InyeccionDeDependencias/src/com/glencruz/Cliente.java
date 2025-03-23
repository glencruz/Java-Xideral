package com.glencruz;

public class Cliente {
    private ServicioMensaje servicioMensaje;

    public Cliente(ServicioMensaje servicioMensaje) {
        this.servicioMensaje = servicioMensaje;
    }

    public void procesarMensaje(String mensaje) {
        this.servicioMensaje.enviarMensaje(mensaje);
    }
}
