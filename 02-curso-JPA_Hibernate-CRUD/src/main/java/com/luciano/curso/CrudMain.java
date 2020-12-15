package com.luciano.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CrudMain {
    
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-JPA-Hibernate_PU");

    public static void main(String[] args) {
        
        Produto produto = new Produto();
        produto.setNome("TV LG 42 polegadas");
        produto.setPreco(1485.65);
        
        
        salvarProduto(produto);
        
        
        Produto produtoPesquisado = pesquisarProdutoPorId(1);
        System.out.println("\n\n");
        System.out.println(produtoPesquisado);
        
        
        produtoPesquisado.setPreco(1246.62);
        alterarProduto(produtoPesquisado);
        
        Produto produtoPesquisado2 = pesquisarProdutoPorId(1);
        System.out.println("\n\nProduto com preço alterado");
        System.out.println(produtoPesquisado2);
        
        
    }
    
    private static void salvarProduto(Produto produto){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();

    }
    
    private static void alterarProduto(Produto produto){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
        em.close();

    }
    
    private  static Produto pesquisarProdutoPorId(Integer id){
        EntityManager em = emf.createEntityManager();
        Produto produto = em.find(Produto.class, id);
        em.close();
        return produto;

    }
    
    
    private void excluirProduto(Integer id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Produto produto = em.find(Produto.class, id);
        em.remove(produto);
        em.getTransaction().commit();
        em.close();

    }

}
