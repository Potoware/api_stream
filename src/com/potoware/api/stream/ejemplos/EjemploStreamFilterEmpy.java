package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpy {

    public static void main(String[] args) {

        long count = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pepa Sucio", "")
                .filter(String::isBlank)
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }
}
