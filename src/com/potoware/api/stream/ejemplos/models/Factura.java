package com.potoware.api.stream.ejemplos.models;

public class Factura {

    private String descripcion;
    private Usuario usuarioFactura;

    public Usuario getUsuarioFactura() {
        return usuarioFactura;
    }

    public void setUsuarioFactura(Usuario usuarioFactura) {
        this.usuarioFactura = usuarioFactura;
    }

    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
