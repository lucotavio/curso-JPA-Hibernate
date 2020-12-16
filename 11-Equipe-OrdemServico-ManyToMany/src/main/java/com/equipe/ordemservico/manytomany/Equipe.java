package com.equipe.ordemservico.manytomany;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EQUIPE")
public class Equipe {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nome")
    private String nome;
    
    @ManyToMany(mappedBy = "listaEquipes")
    private Set<OrdemServico> listaOrdemServico;

    public Equipe() {
        listaOrdemServico = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<OrdemServico> getListaOrdemServico() {
        return listaOrdemServico;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaOrdemServico(Set<OrdemServico> listaOrdemServico) {
        this.listaOrdemServico = listaOrdemServico;
    } 
}
