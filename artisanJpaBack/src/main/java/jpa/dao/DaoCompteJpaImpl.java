package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import jpa.model.Compte;
import jpa.util.JpaContext;

public class DaoCompteJpaImpl implements DaoCompte{

	@Override
	public Compte findByKey(Long key) {
		
		EntityManager em=JpaContext.getInstance().createEntityManager();
		Compte p=null;
		p=em.find(Compte.class, key);
		em.close();
		return p;
	}

	@Override
	public List<Compte> findAll() {
		EntityManager em = JpaContext.getInstance().createEntityManager();
		List<Compte> comptes=null;
		Query query=em.createQuery("select c from Compte p");
		//query.getSingleResult();
		comptes=query.getResultList();
		em.close();
		return comptes;
	}

	@Override
	public void insert(Compte obj) {
		
		EntityManager em=JpaContext.getInstance().createEntityManager();
        EntityTransaction tx=null;

        try {
            tx=em.getTransaction();
            tx.begin();
            em.persist(obj);
            tx.commit();
        } catch (Exception e) {
            if (tx!=null && tx.isActive())
                {tx.rollback();} //annule la transaction, mais vérifier d'abord si elle existe pour éviter le null pointer exception
            e.printStackTrace();
            }finally{ // s'exécute qu'il y ait eu le catch de déclenché ou non 
            	if (em!=null && em.isOpen()) {
            		em.close();
            	}
            	
            }
		
	}

	@Override
	public Compte update(Compte obj) {
		
		EntityManager em=JpaContext.getInstance().createEntityManager();
        EntityTransaction tx=null;
        Compte c=null;

        try {
            tx=em.getTransaction();
            tx.begin();
            c=em.merge(obj);
            tx.commit();
        } catch (Exception e) {
            if (tx!=null && tx.isActive())
                {tx.rollback();} //annule la transaction, mais vérifier d'abord si elle existe pour éviter le null pointer exception
            e.printStackTrace();
            }finally{ // s'exécute qu'il y ait eu le catch de déclenché ou non 
            	if (em!=null && em.isOpen()) {
            		em.close();
            	}
            	
            }
        return c;
	}

	@Override
	public void delete(Compte obj) {
		
		EntityManager em=JpaContext.getInstance().createEntityManager();
        EntityTransaction tx=null;

        try {
            tx=em.getTransaction();
            tx.begin();
            em.remove(em.merge(obj));
            tx.commit();
        } catch (Exception e) {
            if (tx!=null && tx.isActive())
                {tx.rollback();} //annule la transaction, mais vérifier d'abord si elle existe pour éviter le null pointer exception
            e.printStackTrace();
            }finally{ // s'exécute qu'il y ait eu le catch de déclenché ou non 
            	if (em!=null && em.isOpen()) {
            		em.close();
            	}
            	
            }
		
	}

	@Override
	public void deleteByKey(Long key) {
		delete(findByKey(key));
		
	}
	

//	@Override
//	public Compte checkConnect(Compte login, Long mdp) {
//		
//		return null;
//	}


}
