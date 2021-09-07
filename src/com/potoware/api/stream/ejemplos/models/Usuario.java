package com.potoware.api.stream.ejemplos.models;

public class Usuario {
    private String nombres;
    private String apellidos;
    private Integer id;
    private static int ultimoId;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id =++ultimoId;
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

    @Override
    public String toString() {
        return nombres +" " + apellidos ;
    }
}
