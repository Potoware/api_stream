package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamAnyMatch {

    public static void main(String[] args) {

        boolean existe = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pepa Sucio","Pepa Garcia")
                .peek(System.out::println)
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .anyMatch(u->u.getId().equals(1));

        System.out.println(existe);

    }
}
