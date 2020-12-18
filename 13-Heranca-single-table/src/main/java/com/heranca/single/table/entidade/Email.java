package com.heranca.single.table.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMAIL")
public class Email {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "EMAIL")
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Pessoa cliente;

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Pessoa getCliente() {
        return cliente;
    }
    

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    

}
