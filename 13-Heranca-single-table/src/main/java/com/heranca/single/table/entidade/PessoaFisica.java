package com.heranca.single.table.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa{
    
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "CPF")
    private String cpf;

}
