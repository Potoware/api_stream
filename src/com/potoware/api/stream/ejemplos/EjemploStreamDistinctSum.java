package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctSum {

    public static void main(String[] args) {

        IntStream largoUsuarios = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pepa Sucio", "Pepa Garcia","Pato Socio","Pato Socio")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u-> u.toString().length())
                .peek(System.out::println);

        //largoUsuarios.forEach(System.out::println);
        IntSummaryStatistics stats = largoUsuarios.summaryStatistics();
        System.out.println("Max " +stats.getMax());
        System.out.println("Min " +stats.getMin());
        System.out.println("Promedio " +stats.getAverage());
        System.out.println("Suma " +stats.getSum());
        System.out.println("Cuenta " +stats.getCount());

    }
}
