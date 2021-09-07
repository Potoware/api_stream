package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamCount {

    public static void main(String[] args) {

        long count = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pepa Sucio","Pepa Garcia")
                .peek(System.out::println)
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .count();

        System.out.println(count);

    }
}
