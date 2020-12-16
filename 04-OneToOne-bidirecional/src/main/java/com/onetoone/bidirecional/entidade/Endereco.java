package com.onetoone.bidirecional.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ENDERECO")
public class Endereco {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "LOGRADOURO")
    private String logradouro;
    
    @OneToOne
    @JoinColumn(name="ID_FUNCIONARIO")
    private Funcionario funcionario;

    public Integer getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
      
}
