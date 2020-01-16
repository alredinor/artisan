package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import jpa.model.Detail;
import jpa.model.DetailPK;
import jpa.util.JpaContext;

public class DaoDetailJpaImpl implements DaoDetail{

	@Override
	public Detail findByKey(DetailPK key) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		Detail c=null;
		c=em.find(Detail.class, key);
		em.close();
		return c;
	}

	@Override
	public List<Detail> findAll() {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		List<Detail> details=null;
		Query query=em.createQuery("select c from Detail c");
		details=query.getResultList();
		em.close();
		return details;
	}

	@Override
	public void insert(Detail obj) {
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
	public Detail update(Detail obj) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		Detail c=null;
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
	public void delete(Detail obj) {
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
	public void deleteByKey(DetailPK key) {
		EntityManager em=JpaContext.getInstance().createEntityManager();
		EntityTransaction tx=null;
		try {
			tx=em.getTransaction();
			tx.begin();
			em.remove(em.merge(key));
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

}
