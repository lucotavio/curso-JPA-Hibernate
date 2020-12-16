package com.objetos.embutidos;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "NOME", nullable = false, length = 100)   
    private String nome;
    
    @Column(name = "CPF", nullable = false, unique = true, length = 14)
    private String cpf;
    
    @Column(name = "IDENTIDADE", nullable = false, unique = true, length = 20)
    private String identidade;
    
    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;
    
    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;
    
    @Column(name = "TELEFONE", length = 13)
    private String telefone;
    
    @Column(name = "EMAIL", length = 50)
    private String email;
    
    
    
    @Embedded
    private Endereco endereco;
    
    

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

    public Endereco getEndereco() {
        return endereco;
    }
    
    

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

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
