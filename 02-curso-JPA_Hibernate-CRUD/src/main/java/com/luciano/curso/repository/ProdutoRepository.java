package com.luciano.curso.repository;

import com.luciano.curso.entidade.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ProdutoRepository {
    
    private EntityManagerFactory emf;

    public ProdutoRepository() {
        emf = Persistence.createEntityManagerFactory("curso-JPA-Hibernate_PU");
    }
    
    public void salvar(Produto produto){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();

    }
    
    public void alterar(Produto produto){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
        em.close();

    }
    
    public Produto pesquisarProdutoPorId(Integer id){
        EntityManager em = emf.createEntityManager();
        Produto produto = em.find(Produto.class, id);
        em.close();
        return produto;

    }
    
    
    public void excluir(Integer id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Produto produto = em.find(Produto.class, id);
        em.remove(produto);
        em.getTransaction().commit();
        em.close();

    }
    
    
}
