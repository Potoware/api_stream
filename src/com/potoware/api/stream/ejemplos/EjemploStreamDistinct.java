package com.potoware.api.stream.ejemplos;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {

    public static void main(String[] args) {

        Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pato Socio", "Pepa Garcia","Pato Socio","Pato Socio")
                .distinct()
                .forEach(System.out::println);
    }
}
