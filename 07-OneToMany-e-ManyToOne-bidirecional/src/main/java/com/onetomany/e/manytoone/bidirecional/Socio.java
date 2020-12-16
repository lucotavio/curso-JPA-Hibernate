package com.onetomany.e.manytoone.bidirecional;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SOCIO")
public class Socio {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @OneToMany(mappedBy = "socio")
    @JoinColumn(name = "ID_SOCIO", referencedColumnName = "ID")
    private Set<Dependente> dependentes;

    
    public Socio() {
        dependentes = new HashSet<>();
    }

    
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Dependente> getDependentes() {
        return Collections.unmodifiableSet(dependentes);

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDependente(Dependente dependente) {
        dependentes.add(dependente);
    }

}
