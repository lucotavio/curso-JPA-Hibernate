package com.luciano.curso.entidade;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import jdk.jfr.Timestamp;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
    
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NOME", nullable = false, length = 100)   
    private String nome;
    
    @Column(name = "CPF", nullable = false, length = 14)
    private String cpf;
    
    @Column(name = "IDENTIDADE", nullable = false, length = 20)
    private String identidade;
    
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;
    
    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;
    
    @Column(name = "TELEFONE", length = 13)
    private String telefone;
    
    @Column(name = "EMAIL", length = 50)
    private String email;
    
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
    

    public Cliente() {     
        this.dataCadastro = LocalDate.now();
    }
    
    
    //Gets
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

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

    
    //Sets
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", identidade=" + identidade + ", dataNascimento=" + dataNascimento + ", dataCadastro=" + dataCadastro + ", telefone=" + telefone + ", email=" + email + ", logradouro=" + logradouro + ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
    
    

}
