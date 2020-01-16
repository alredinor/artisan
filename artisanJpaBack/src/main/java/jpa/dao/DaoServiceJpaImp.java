package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import jpa.model.Service;
import jpa.util.JpaContext;

public class DaoServiceJpaImp implements DaoService{

	@Override
	public Service findByKey(Integer key) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		Service p=null;
		p=em.find(Service.class, key); //on utilise une méthode qui existe déjà
		em.close();
		return p;
	}

	@Override
	public List<Service> findAll() {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		List<Service> personnes=null;
		Query query=em.createQuery("select p from Personne p");  //peut s'écrire ("from Personne p"). On met une CLASSE et pas une TABLE derrière le FROM
		personnes=query.getResultList();
		em.close();
		return personnes;
	}

	@Override
	public void insert(Service obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		
		try {
			tx=em.getTransaction();
			tx.begin();
			em.persist(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx!=null && tx.isActive())
				{tx.rollback(); //annule la transaction, mais vérifier d'abord si elle existe pour éviter le null pointer exception
			} 
			e.printStackTrace();
		} finally { // s'exécute qu'il y ait eu le catch de déclenché ou non 
			if (em!=null && em.isOpen())
			{em.close();}
		}
	}

	@Override
	public Service update(Service obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		Service p=null;
		try {
			tx=em.getTransaction();
			tx.begin();
			p=em.merge(obj); // MEME CODE QUE INSERT sauf cette ligne
			tx.commit();
		} catch (Exception e) {
			if (tx!=null && tx.isActive())
				{tx.rollback(); //annule la transaction, mais vérifier d'abord si elle existe pour éviter le null pointer exception
			} 
			e.printStackTrace();
		} finally { // s'exécute qu'il y ait eu le catch de déclenché ou non 
			if (em!=null && em.isOpen())
			{em.close();}
		}
		return p;
	}

	@Override
	public void delete(Service obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		
		try {
			tx=em.getTransaction();
			tx.begin();
			em.remove(em.merge(obj));  // MEME CODE QUE INSERT sauf cette ligne
			tx.commit();
		} catch (Exception e) {
			if (tx!=null && tx.isActive())
				{tx.rollback(); //annule la transaction, mais vérifier d'abord si elle existe pour éviter le null pointer exception
			} 
			e.printStackTrace();
		} finally { // s'exécute qu'il y ait eu le catch de déclenché ou non 
			if (em!=null && em.isOpen())
			{em.close();}
		}
	}

	@Override
	public void deleteByKey(Integer key) {
		delete(findByKey(key));
		
	}

}
