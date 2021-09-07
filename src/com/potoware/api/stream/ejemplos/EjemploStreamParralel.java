package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParralel {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres", "Fonseca")) ;
        lista.add(new Usuario("Juan", "Camacho"));
        lista.add(new Usuario("Rocky", "Sucio"));
        lista.add(new Usuario("Muñeca","Negra"));
        lista.add(new Usuario("Muñeca","Blanca"));
        lista.add(new Usuario("Muñeca","Gris"));
        lista.add(new Usuario("Michi", "War"));
        lista.add(new Usuario("Roger", "Blanco"));
        lista.add(new Usuario("Lucy","Pelos"));

        long t1 = System.currentTimeMillis();
        String resultados = lista.stream()
                .parallel()
                .map(u->u.toString().toUpperCase())
                .peek(n-> System.out.println("Thread: "+Thread.currentThread().getName() + " - " +n))
                .flatMap(nombre->{
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(nombre.contains("Muñeca".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: "+(t2-t1));
        System.out.println(resultados);
    }
}
