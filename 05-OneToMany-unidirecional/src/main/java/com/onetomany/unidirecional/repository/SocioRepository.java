package com.onetomany.unidirecional.repository;

import com.onetomany.unidirecional.entidade.Socio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SocioRepository {
    
    private EntityManagerFactory emf;

    public SocioRepository() {
        emf = Persistence.createEntityManagerFactory("curso-JPA-Hibernate_PU");
    }
    
    public void salvar(Socio socio){
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        
        em.persist(socio);
        
        etx.commit();
        em.close();      
    }

}
