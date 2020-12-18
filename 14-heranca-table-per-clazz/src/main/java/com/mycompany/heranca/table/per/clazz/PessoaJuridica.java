package com.mycompany.heranca.table.per.clazz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa{
    
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    
    @Column(name = "NOME_FANTASIA")
    private String nomefantasia;
    
    @Column(name = "CNPJ")
    private String cnpj;

}
