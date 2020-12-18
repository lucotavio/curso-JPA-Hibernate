package com.heranca.single.table.entidade;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
    
    @Column(name = "LOGRADOURO", nullable = false, length = 50)
    private String logradouro;
    
    @Column(name = "CEP", nullable = false, length = 9) 
    private String cep;
    
    @Column(name = "BAIRRO", nullable = false, length = 50) 
    private String bairro;
    
    @Column(name = "CIDADE", nullable = false, length = 50)
    private String cidade;
    
    @Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
