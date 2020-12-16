package com.manytomany.bidirecional;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "AUTOR")
public class Autor {
    
    @Id
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "NOME")
    private String nome;
    
    @ManyToMany(mappedBy = "autor")
    private Set<Livro> livros;

    
    public Autor() {
        livros = new HashSet<>();
    }
    
    
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Livro> getLivros() {
        return livros;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }
     
}
