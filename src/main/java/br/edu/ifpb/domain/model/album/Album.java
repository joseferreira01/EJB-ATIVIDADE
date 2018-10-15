package br.edu.ifpb.domain.model.album;

import br.edu.ifpb.domain.model.banda.Banda;
import java.time.LocalDate;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/11/2017, 09:37:05
 */
public class Album {

    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private Estilo estilo; //Rock, Pop, Sertanejo
    private Banda banda;
    private LocalDate anoDeLancamento;

    public Album() {
    }

    public Album(Estilo estilo, Banda banda, LocalDate anoDeLancamento) {
        this.estilo = estilo;
        this.banda = banda;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public LocalDate getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(LocalDate anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

}
