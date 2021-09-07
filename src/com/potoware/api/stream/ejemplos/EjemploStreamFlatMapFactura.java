package com.potoware.api.stream.ejemplos;

import com.potoware.api.stream.ejemplos.models.Factura;
import com.potoware.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Jhon", "Due");
        Usuario u2 = new Usuario("Rocky", "Sucio");

        u1.addFacturas(new Factura("Compra Tecnoligia"));
        u1.addFacturas(new Factura("Compra Casa"));
        u1.addFacturas(new Factura("Compra Juegos"));

        u2.addFacturas(new Factura("Compra Herramientas Musicales"));
        u2.addFacturas(new Factura("Compra Herramientas Obras"));
        u2.addFacturas(new Factura("Compra Pintura"));

        List<Usuario> usuariosList = Arrays.asList(u1,u2);

        usuariosList.stream()
                .flatMap(u->u.getFacturas().stream())
                .forEach(f-> System.out.println(f.getDescripcion().concat(" ").concat(f.getUsuarioFactura().toString())));
        /*for(Usuario u: usuariosList){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
