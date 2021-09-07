package com.potoware.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {

    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pato Socio", "Pepa Garcia","Pato Socio","Pato Socio")
                .distinct();

        String resultado = nombres.reduce("",(a,b)-> a+","+b);
        System.out.println(resultado);
    }
}
