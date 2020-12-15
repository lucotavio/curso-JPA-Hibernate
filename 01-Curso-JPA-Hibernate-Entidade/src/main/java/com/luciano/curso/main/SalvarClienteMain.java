package com.luciano.curso.main;

import com.luciano.curso.entidade.Cliente;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SalvarClienteMain {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.setNome("Adriano Gonçalves de Oliveira");
        LocalDate dataNascimento = LocalDate.of(1977, Month.OCTOBER, 4);
        cliente.setDataNascimento(dataNascimento);
        cliente.setCpf("047.276.406-35");
        cliente.setIdentidade("MG8460189");
        cliente.setTelefone("(31)32833644");
        cliente.setEmail("luc.otavio@gmail.com");
        cliente.setLogradouro("Rua Padre Correia de Almeida 315");
        cliente.setCep("30260350");
        cliente.setBairro("Santa Efigênia");
        cliente.setCidade("Belo Horizonte");
        cliente.setEstado("MG");
        
        salvarCliente(cliente);
        
        Cliente clientePesquisado = pesquisarClientePorId(1);
        System.out.println("\n\n\n");
        System.out.println(cliente);
        
        
        
        
    }
    
    public static void salvarCliente(Cliente cliente){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-JPA-Hibernate_PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(cliente);
        tx.commit();
        em.close();
        
    }
    
    public static Cliente pesquisarClientePorId(Integer id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-JPA-Hibernate_PU");
        EntityManager em = emf.createEntityManager();
        Cliente cliente = em.find(Cliente.class, 1);
        return cliente;
    }
    

}
