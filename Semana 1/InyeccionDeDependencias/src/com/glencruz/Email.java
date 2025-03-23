package com.glencruz;

public class Email implements ServicioMensaje {
    public Email() {
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando Correo: " + mensaje);
    }
}
