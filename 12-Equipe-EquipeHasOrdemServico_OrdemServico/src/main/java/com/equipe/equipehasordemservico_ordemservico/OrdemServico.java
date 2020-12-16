package com.equipe.equipehasordemservico_ordemservico;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ORDEM_SERVICO")
public class OrdemServico {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NUMERO_ORDEM_SERVICO")
    private String numeroOrdemServico;
    
    @OneToMany(mappedBy = "ordemServico")
    private Set<EquipeHasOrdemServico> listaEquipeHasOrdemServico;

    public OrdemServico() {
        listaEquipeHasOrdemServico = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNumeroOrdemServico() {
        return numeroOrdemServico;
    }

    public Set<EquipeHasOrdemServico> getListaEquipeHasOrdemServico() {
        return listaEquipeHasOrdemServico;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumeroOrdemServico(String numeroOrdemServico) {
        this.numeroOrdemServico = numeroOrdemServico;
    }

    public void setListaEquipeHasOrdemServico(Set<EquipeHasOrdemServico> listaEquipeHasOrdemServico) {
        this.listaEquipeHasOrdemServico = listaEquipeHasOrdemServico;
    }

}
