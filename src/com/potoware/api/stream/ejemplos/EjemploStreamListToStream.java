package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
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

        lista.stream()
                .map(u->u.getNombres().toUpperCase().concat(" ").concat(u.getApellidos().toUpperCase()))
                .flatMap(nombre->{
                    if(nombre.contains("Muñeca".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
    }
}
