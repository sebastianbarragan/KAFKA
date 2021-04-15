package eam.edu.com.votanteConsumer.model.msj;

import eam.edu.com.votanteConsumer.model.Puestovotacion;

import javax.persistence.*;

public class VotanteMessage {


    private String id;


    private String nombrevotante;

    private boolean cambio;


    private Puestovotacion puestovotacion;

    public VotanteMessage() {

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

    public Puestovotacion getPuestovotacion() {
        return puestovotacion;
    }

    public void setPuestovotacion(Puestovotacion puestovotacion) {
        this.puestovotacion = puestovotacion;
    }
}

