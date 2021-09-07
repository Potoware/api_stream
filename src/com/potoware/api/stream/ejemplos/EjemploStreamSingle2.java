package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamSingle2 {

    public static void main(String[] args) {

        Usuario usuarios = Stream
                .of("Pato Socio", "Paco Social", "Pepe Sociedad", "Pepa Sucio","Pepa Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u->u.getId().equals(4)).findFirst().get();

        System.out.println(usuarios);

    }
}
