package com.luciano.curso.entidade;

import com.luciano.curso.repository.ProdutoRepository;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TesteProdutoRepository {
    
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-JPA-Hibernate_PU");

    public static void main(String[] args) {
        
        ProdutoRepository repository = new ProdutoRepository();
        
        Produto produto = new Produto();
        produto.setNome("TV LG 42 polegadas");
        produto.setPreco(1485.65);
        
        
        //Salvando o produto no banco de dados
        repository.salvar(produto);
        
        
        //pesquisando o produto no banco de dados usando o campo id
        Produto produtoPesquisado = repository.pesquisarProdutoPorId(1);
        System.out.println("\n\n");
        System.out.println(produtoPesquisado);
        
        
        // Alterando preço do produto
        produtoPesquisado.setPreco(1246.62);
        
        
        //salvando alteração no objeto produto no banco de dados
        repository.alterar(produtoPesquisado);
        
        
        //pesquisando o produto no banco de dados usando o campo id
        produtoPesquisado = repository.pesquisarProdutoPorId(1);
        System.out.println("\n\n");
        System.out.println(produtoPesquisado);
        
        
        //Apagando produto do banco
        repository.excluir(1);
        
        
        //pesquisando o produto no banco de dados usando o campo id
        produtoPesquisado = repository.pesquisarProdutoPorId(1);
        System.out.println("\n\n");
        System.out.println(produtoPesquisado);
        
        
    }
    
    

}
