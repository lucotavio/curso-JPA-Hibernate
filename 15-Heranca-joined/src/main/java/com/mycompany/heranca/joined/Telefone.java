package com.mycompany.heranca.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONE")
public class Telefone {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPOD_TELEFONE")
    private TipoTelefone tipoTelefone;
    
    @Column(name = "DDD")
    private String ddd;
    
    @Column(name = "NUMERO")
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Pessoa cliente;

    public Integer getId() {
        return id;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    
}
