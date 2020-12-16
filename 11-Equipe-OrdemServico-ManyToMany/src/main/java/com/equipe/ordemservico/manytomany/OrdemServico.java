package com.equipe.ordemservico.manytomany;

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
    
    @ManyToMany
    @JoinTable(
            name="EQUIPE_HAS_ORDEM_SERVICO",
            joinColumns = @JoinColumn(name = "ID_ORDEM_SERVICO"),
            inverseJoinColumns=@JoinColumn(name="ID_EQUIPE")
    )
    private Set<Equipe> listaEquipes;

    public OrdemServico() {
        listaEquipes = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNumeroOrdemServico() {
        return numeroOrdemServico;
    }

    public Set<Equipe> getListaEquipes() {
        return listaEquipes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumeroOrdemServico(String numeroOrdemServico) {
        this.numeroOrdemServico = numeroOrdemServico;
    }

    public void setListaEquipes(Set<Equipe> listaEquipes) {
        this.listaEquipes = listaEquipes;
    }
    
}
