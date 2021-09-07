package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {

    public static void main(String[] args) {

        Stream<Usuario> usuarios = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pepa Sucio","Pepa Garcia","pepe Garcia","pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u-> {
                    if(u.getNombres().equals("pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(u -> System.out.println(u.getNombres()));


        usuarios.forEach(u -> System.out.println(u.getApellidos()));
    }
}
