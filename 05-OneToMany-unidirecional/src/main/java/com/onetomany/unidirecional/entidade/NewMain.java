package com.onetomany.unidirecional.entidade;

import com.onetomany.unidirecional.repository.SocioRepository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class NewMain {

    public static void main(String[] args) {
        Socio socio = new Socio();
        socio.setNome("Luciano");
        
        Dependente dependente = new Dependente();
        dependente.setNome("Pedro");
        
        socio.adicionarDependente(dependente);
        
        SocioRepository socioRepository = new SocioRepository();
        socioRepository.salvar(socio);
        
    }

}
