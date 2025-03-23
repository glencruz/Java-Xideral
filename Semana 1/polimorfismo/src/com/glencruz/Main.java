package com.glencruz;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Catalogo de servicios de Streaming *****\n");

        show(
                new Video(199,"Netflix"),
                new Musica(149,"Spotify"),
                new Video(129,"Max"),
                new Juego(99, "Prime Gaming"),
                new Musica(169,"Apple Music")
        );
    }


    static void show(Servicio... servicios) {
        for (Servicio stream : servicios) {
            System.out.println(stream.mostrar());
        }
    }
}