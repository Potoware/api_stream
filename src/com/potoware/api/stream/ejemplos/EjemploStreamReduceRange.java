package com.potoware.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamReduceRange {

    public static void main(String[] args) {

        IntStream nombres = IntStream.range(15,50)
                .peek(System.out::println);

        //Integer resultado = nombres.reduce(0,Integer::sum);
        //int resultado = nombres.sum();
        IntSummaryStatistics stats = nombres.summaryStatistics();
        System.out.println("Max " +stats.getMax());
        System.out.println("Min " +stats.getMin());
        System.out.println("Promedio " +stats.getAverage());
        System.out.println("Suma " +stats.getSum());
        System.out.println("Cuenta " +stats.getCount());
    }
}
