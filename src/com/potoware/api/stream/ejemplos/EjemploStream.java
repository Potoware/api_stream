package com.potoware.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String[] args) {

        System.out.println("\nStream of directo  a Stream");
        Stream<String> nombres = Stream.of("Pato","Paco", "Pepe","Pepa");
        nombres.forEach(System.out::println);

        System.out.println("\nArreglo a Stream");
        String[] arr = {"Pato","Paco", "Pepe","Pepa"};
        Stream<String> nombres2 = Arrays.stream(arr);
        nombres2.forEach(System.out::println);

        System.out.println("\nString Builder a Stream");
        Stream<String> nombres3 = Stream.<String>builder().add("Apco")
                .add("Pico")
                .add("Poco")
                .add("Puca")
                .add("Paca")
                .build();

        nombres3.forEach(System.out::println);

        System.out.println("\nLista a Stream");
        List<String> lista = new ArrayList<>();
        lista.add("Paco");
        lista.add("Peco");
        lista.add("Pico");
        lista.add("Poco");
        lista.add("Puca");
        Stream<String> nombres4 = lista.stream();
        nombres4.forEach(System.out::println);

    }
}
