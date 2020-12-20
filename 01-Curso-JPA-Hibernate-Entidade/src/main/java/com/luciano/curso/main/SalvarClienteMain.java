package com.luciano.curso.main;

import com.luciano.curso.entidade.Cliente;
import com.luciano.curso.repository.ClienteRepository;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SalvarClienteMain {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.setNome("Luciano Otavio Gonçalves de Oliveira");
        LocalDate dataNascimento = LocalDate.of(1972, Month.OCTOBER, 2);
        cliente.setDataNascimento(dataNascimento);
        cliente.setCpf("848.812.500-35");
        cliente.setIdentidade("MG8580189");
        cliente.setTelefone("(31)32833644");
        cliente.setEmail("luc.otaviogo@gmail.com");
        cliente.setLogradouro("Rua Padre Manuel Rodrigues");
        cliente.setCep("30260320");
        cliente.setBairro("Santa Efigênia");
        cliente.setCidade("Belo Horizonte");
        cliente.setEstado("MG");
        
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.salvar(cliente);
        
        Cliente clientePesquisado = clienteRepository.pesquisarPorId(1);
        System.out.println("\n\n\n");
        System.out.println(clientePesquisado);
        
    }

    

}
