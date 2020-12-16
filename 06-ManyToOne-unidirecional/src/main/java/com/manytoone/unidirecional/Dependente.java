package com.manytoone.unidirecional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEPENDENTE")
public class Dependente {
    
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NOME")
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "ID_SOCIO")
    private Socio socio;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Socio getSocio() {
        return socio;
    }
    
    

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    

}
