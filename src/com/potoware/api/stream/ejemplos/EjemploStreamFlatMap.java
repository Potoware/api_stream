package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {

    public static void main(String[] args) {

        Stream<Usuario> usuarios = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pepa Sucio","Pepa Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u->u.getNombres().equals("Pepe"))
                .peek(u -> System.out.println(u.getNombres()));
        List<Usuario> usuariosList = usuarios.collect(Collectors.toList());

        usuariosList.forEach(u -> System.out.println(u.getApellidos()));
    }
}
