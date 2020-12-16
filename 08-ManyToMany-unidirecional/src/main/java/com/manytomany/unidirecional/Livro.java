package com.manytomany.unidirecional;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRO")
public class Livro {
    
    @Id
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "NOME")
    private String nome;
    
    @ManyToMany
    @JoinTable(
            name="LIVRO_AUTHOR",
            joinColumns = @JoinColumn(name = "ID_LIVRO"),
            inverseJoinColumns=@JoinColumn(name="ID_AUTOR")
    )
    private Set<Autor> autores;

    public Livro() {
        autores = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
    
}
