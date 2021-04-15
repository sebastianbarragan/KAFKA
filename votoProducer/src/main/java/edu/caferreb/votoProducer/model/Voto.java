package edu.caferreb.votoProducer.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "voto")
@Entity
public class Voto {
     @Id
    String cedula_votante;
    @Column(name="id_candidato")
    String id_candidato;
    @Column(name="id_puesto_votacion")
    String id_puesto_votacion;
    @Column(name="fecha_hora")
    String fecha_hora;

    public Voto() {
    }

    public Voto(String cedula_votante, String id_candidato, String id_puesto_votacion, String fecha_hora) {
        this.cedula_votante = cedula_votante;
        this.id_candidato = id_candidato;
        this.id_puesto_votacion = id_puesto_votacion;
        this.fecha_hora = fecha_hora;
    }

    public String getCedula_votante() {
        return cedula_votante;
    }

    public void setCedula_votante(String cedula_votante) {
        this.cedula_votante = cedula_votante;
    }

    public String getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(String id_candidato) {
        this.id_candidato = id_candidato;
    }

    public String getId_puesto_votacion() {
        return id_puesto_votacion;
    }

    public void setId_puesto_votacion(String id_puesto_votacion) {
        this.id_puesto_votacion = id_puesto_votacion;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }


}
