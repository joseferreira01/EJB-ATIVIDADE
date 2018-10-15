package br.edu.ifpb.domain.model.banda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/11/2017, 13:39:19
 */
@Entity
public class Banda implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nomeFantasia;
    @ManyToOne
    private List<Integrante> integrantes = new ArrayList<>();

    public Banda(int id, String nomeFantasia) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
    }

    public Banda() {
    }

    public void novoIntegrante(Integrante integrante) {
        this.integrantes.add(integrante);
    }

    public void removerIntegrante(Integrante integrante) {
        this.integrantes.remove(integrante);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 59 * hash + Objects.hashCode(this.integrantes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banda other = (Banda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.integrantes, other.integrantes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banda{" + "nome=" + nomeFantasia + ", integrantes=" + integrantes + '}';
    }

}
