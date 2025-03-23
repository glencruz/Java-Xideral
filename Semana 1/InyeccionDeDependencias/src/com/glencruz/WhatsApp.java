package com.glencruz;

public class WhatsApp implements ServicioMensaje {
    public WhatsApp() {
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando Whats: " + mensaje);
    }
}

