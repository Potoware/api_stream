package com.potoware.api.stream.ejemplos.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String nombres;
    private String apellidos;
    private Integer id;
    private static int ultimoId;
    public Integer getId() {
        return id;
    }
    private List<Factura> facturas;

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id =++ultimoId;
        this.facturas = new ArrayList<>();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Usuario.ultimoId = ultimoId;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void addFacturas(Factura facturas) {
        this.facturas.add(facturas);
        facturas.setUsuarioFactura(this);
    }

    @Override
    public String toString() {
        return nombres +" " + apellidos ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombres, usuario.nombres) && Objects.equals(apellidos, usuario.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombres, apellidos);
    }
}
