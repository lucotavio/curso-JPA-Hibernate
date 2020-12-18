package com.mycompany.heranca.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaFisica extends Pessoa{
    
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "CPF")
    private String cpf;

}
