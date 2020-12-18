package com.heranca.single.table.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class PessoaJuridica extends Pessoa{
    
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    
    @Column(name = "NOME_FANTASIA")
    private String nomefantasia;
    
    @Column(name = "CNPJ")
    private String cnpj;

}
