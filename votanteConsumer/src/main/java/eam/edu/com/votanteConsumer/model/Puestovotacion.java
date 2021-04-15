package eam.edu.com.votanteConsumer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "puestovotacion")
@Entity
public class Puestovotacion {

    @Id
    private String id;

    @Column(name = "nombrepuesto")
    private String nombrepuesto;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "departamento")
    private String departamento;

    public Puestovotacion(){

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
