package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import jpa.model.Demande;
import jpa.util.JpaContext;

public class DaoDemandeJpaImpl implements DaoDemande{

	@Override
	public Demande findByKey(Long key) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		Demande d=null;
		d=em.find(Demande.class, key);
		em.close();
		return d;
	}

	@Override
	public List<Demande> findAll() {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		List<Demande> demandes=null;
		Query query=em.createQuery("select c from Demande c");
		demandes=query.getResultList();
		em.close();
		return demandes;
	}

	@Override
	public void insert(Demande obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		try {
			tx=em.getTransaction();
			tx.begin();
			em.persist(obj);
			tx.commit();

		}catch(Exception e) {
			if(tx!=null && tx.isActive())
			{
				tx.rollback();
			}
			e.printStackTrace();
		}	
		finally 
		{
			if(em!=null && em.isOpen()) {
				em.close();	
			}
		}
		
	}

	@Override
	public Demande update(Demande obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		Demande d=null;
		try {
			tx=em.getTransaction();
			tx.begin();
			d=em.merge(obj);
			tx.commit();

		}catch(Exception e) {
			if(tx!=null && tx.isActive()){
				tx.rollback();
			}
			e.printStackTrace();
		}	
		finally 
		{
			if(em!=null && em.isOpen()) {
				em.close();	
			}
		}
		return d;
		
	}

	@Override
	public void delete(Demande obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		try {
			tx=em.getTransaction();
			tx.begin();
			em.remove(em.merge(obj));
			tx.commit();

		}catch(Exception e) {
			if(tx!=null && tx.isActive())
			{
				tx.rollback();
			}
			e.printStackTrace();
		}	
		finally 
		{
			if(em!=null && em.isOpen()) {
				em.close();	
			}
		}
		
	}

	@Override
	public void deleteByKey(Long key) {
		delete(findByKey(key));
		
	}

}
