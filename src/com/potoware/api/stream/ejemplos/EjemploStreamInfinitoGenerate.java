package com.potoware.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {

        AtomicInteger contado = new AtomicInteger(0);
        Stream.generate(()->
        {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                contado.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return  contado + ": Hola Mundo";
        })
                .limit(7)
                .forEach(System.out::println);
    }
}
