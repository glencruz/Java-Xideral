package com.glencruz;

public class Main {
    public static void main(String[] args) {
        ServicioMensaje servicioEmail = new Email();
        Cliente clienteEmail = new Cliente(servicioEmail);
        clienteEmail.procesarMensaje("Hola, este es un mensaje por email.");

        ServicioMensaje servicioSMS = new SMS();
        Cliente clienteSMS = new Cliente(servicioSMS);
        clienteSMS.procesarMensaje("Hola, este es un mensaje por SMS.");

        ServicioMensaje servicioWhats = new WhatsApp();
        Cliente clienteWhats = new Cliente(servicioWhats);
        clienteWhats.procesarMensaje("Hola, este es un mensaje por WhatsApp.");
    }
}