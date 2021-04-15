package edu.caferreb.votoProducer.model;

public class Candidato {

    private String codigo;

    private String nombre;

    private Partido partido;

    private String estado;

    public Candidato() {
    }

    public Candidato(String codigo, String nombre, Partido partido, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.partido = partido;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
