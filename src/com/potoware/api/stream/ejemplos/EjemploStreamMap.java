package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {

    public static void main(String[] args) {


        System.out.println("\n--------MAP---------");
        Stream<String> nombres = Stream.of("Pato","Paco", "Pepe","Pepa").map(nombre -> {
            return nombre.toUpperCase();
        });

        nombres.forEach(System.out::println);

        System.out.println("\n--------peak---------");
        Stream<String> nombres2 = Stream.of("Pato","Paco", "Pepe","Pepa").peek(e-> System.out.println(e)).map(nombre -> {
            return nombre.toUpperCase();
        });
        List<String> lista = nombres2.collect(Collectors.toList());
        System.out.println("\n--------a lista---------");
        for (String nom: lista) {
            System.out.println(nom);
        }
        //nombres2.forEach(System.out::println);

        System.out.println("\n--------creando usuarios desde lista---------");
        Stream<Usuario> usuarios = Stream
                .of("Pato Socio","Paco Social", "Pepe Sociedad","Pepa Sucio")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(u-> System.out.println(u.getNombres()))
                .map(usuario -> {
                    String nombre = usuario.getNombres().toUpperCase();
                    usuario.setNombres(nombre);
                    return usuario;
                });
      List<Usuario>usuariosList = usuarios.collect(Collectors.toList());

        usuariosList.forEach(u-> System.out.println(u.getApellidos()));
    }
}
