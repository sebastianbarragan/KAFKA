package eam.edu.com.votingConsumer.model;

import javax.persistence.*;
import java.io.Serializable;
@Table(name= "candidato")
@Entity
public class Candidato {


        @Id
        private String codigo ;
        @Column(name="nombre")
        private String nombre;

        @ManyToOne
        @JoinColumn(name = "partido_codigo")
        private Partido partido;
        @Column(name="estado")
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
