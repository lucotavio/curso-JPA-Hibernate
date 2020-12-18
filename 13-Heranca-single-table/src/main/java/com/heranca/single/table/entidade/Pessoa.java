package com.heranca.single.table.entidade;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pessoa {
    
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
 
    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;
       
    @Embedded
    private Endereco endereco;
    
    @OneToMany(mappedBy = "cliente")
    private Set<Telefone> telefones;
    
    @OneToMany(mappedBy = "cliente")
    private Set<Email> emails;
    
    
    public Integer getId() {
        return id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public Set<Email> getEmails() {
        return emails;
    }
    
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }
      
}
