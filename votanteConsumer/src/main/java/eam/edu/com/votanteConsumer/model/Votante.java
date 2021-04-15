package eam.edu.com.votanteConsumer.model;

import javax.persistence.*;
@Table(name = "votante")
@Entity
public class Votante {

        @Id
        private String id;

        @Column(name = "nombrevotante")
        private String nombrevotante;

        @Column(name = "cambio")
        private boolean cambio;

        @ManyToOne
        @JoinColumn(name = "puesto_votacion_id")
        private Puestovotacion puestovotacion;

    public Votante(String id, String nombrevotante, boolean cambio, Puestovotacion puestovotacion) {
        this.id = id;
        this.nombrevotante = nombrevotante;
        this.cambio = cambio;
        this.puestovotacion = puestovotacion;
    }

    public Votante() {
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
