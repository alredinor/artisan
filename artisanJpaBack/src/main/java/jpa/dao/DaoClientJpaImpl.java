package jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import jpa.model.Client;
import jpa.model.Demande;
import jpa.util.JpaContext;

public class DaoClientJpaImpl implements DaoClient {

	@Override
	public Client findByKey(Long key) {
		
		EntityManager em=JpaContext.getInstance().createEntityManager();
		Client c=null;
		c=em.find(Client.class, key);
		em.close();
		return c;
	}

	@Override
	public List<Client> findAll() {
		
		EntityManager em=JpaContext.getInstance().createEntityManager();
		List<Client> clients=null;
		Query query=em.createQuery("from Compte where type_compte='C'");
		clients=query.getResultList();
		em.close();
		return clients;
	}

	@Override
	public void insert(Client obj) {
		
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
	public Client update(Client obj) {
		
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		Client c=null;
		try {
			tx=em.getTransaction();
			tx.begin();
			c=em.merge(obj);
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
		return c;
	}

	@Override
	public void delete(Client obj) {
		
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

	
//	public List<Demande> findByAllDemande(String nom){
//	
//	EntityManager em=JpaContext.getInstance().createEntityManager();
//	Query query=em.createQuery("select f from Demande f ");
//	query.setParameter("skill",nom);
//	List<Demande> demandes=query.getResultList();
//	em.close();
//	return demandes;
//	}
}
