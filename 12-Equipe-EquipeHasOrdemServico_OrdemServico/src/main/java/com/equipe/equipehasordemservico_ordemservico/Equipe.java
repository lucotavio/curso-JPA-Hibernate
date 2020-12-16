package com.equipe.equipehasordemservico_ordemservico;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
    
    @OneToMany(mappedBy = "equipe")
    private Set<EquipeHasOrdemServico> listaEquipeHasOrdemServico;

    public Equipe() {
        listaEquipeHasOrdemServico = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<EquipeHasOrdemServico> getListaEquipeHasOrdemServico() {
        return listaEquipeHasOrdemServico;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaEquipeHasOrdemServico(Set<EquipeHasOrdemServico> listaEquipeHasOrdemServico) {
        this.listaEquipeHasOrdemServico = listaEquipeHasOrdemServico;
    }

}
