package com.potoware.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceEnteros {

    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(5,10,20,45,12,23);

        Integer resultado = nombres.reduce(0,Integer::sum);
        System.out.println(resultado);
    }
}
