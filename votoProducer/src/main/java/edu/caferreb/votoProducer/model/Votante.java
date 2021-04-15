package edu.caferreb.votoProducer.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Votante {


    private String id;

    private String nombrevotante;

    private boolean cambio;

    private PuestoVotacion puestovotacion;

    public Votante() {

    }

    public Votante(String id, String nombrevotante, boolean cambio, PuestoVotacion puestovotacion) {
        this.id = id;
        this.nombrevotante = nombrevotante;
        this.cambio = cambio;
        this.puestovotacion = puestovotacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombrevotante() {
        return nombrevotante;
    }

    public void setNombrevotante(String nombrevotante) {
        this.nombrevotante = nombrevotante;
    }

    public boolean isCambio() {
        return cambio;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }

    public PuestoVotacion getPuestovotacion() {
        return puestovotacion;
    }

    public void setPuestovotacion(PuestoVotacion puestovotacion) {
        this.puestovotacion = puestovotacion;
    }
}
