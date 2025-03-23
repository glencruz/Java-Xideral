package com.glencruz;

public class SMS implements ServicioMensaje {
    public SMS() {
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}