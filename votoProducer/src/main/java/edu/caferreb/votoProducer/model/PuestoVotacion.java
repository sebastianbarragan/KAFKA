package edu.caferreb.votoProducer.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PuestoVotacion {



    private String id;

    private String nombrepuesto;

    private String lugar;

    private String municipio;

    private String departamento;

    public PuestoVotacion(String id) {
        this.id = id;
    }

    public PuestoVotacion(String id, String nombrepuesto, String lugar, String municipio, String departamento) {
        this.id = id;
        this.nombrepuesto = nombrepuesto;
        this.lugar = lugar;
        this.municipio = municipio;
        this.departamento = departamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombrepuesto() {
        return nombrepuesto;
    }

    public void setNombrepuesto(String nombrepuesto) {
        this.nombrepuesto = nombrepuesto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
