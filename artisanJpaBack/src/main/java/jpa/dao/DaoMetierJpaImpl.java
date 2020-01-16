package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import jpa.model.Metier;
import jpa.util.JpaContext;

public class DaoMetierJpaImpl implements DaoMetier
{

	@Override
	public Metier findByKey(Long key)
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();	
		Metier p = null;
		p = em.find(Metier.class, key);
		em.close();
		return p;
	}

	@Override
	public List<Metier> findAll()
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();
		List<Metier> metiers = null;
		Query query = em.createQuery("from Metier m");
		metiers = query.getResultList();
		em.close();
		return metiers;
	}

	@Override
	public void insert(Metier obj)
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;

		try 
		{
			tx = em.getTransaction();
			tx.begin();
			em.persist(obj);
			tx.commit();
		}
		catch(Exception e) 
		{
			if(tx != null && tx.isActive())
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			if(em != null && em.isOpen())
			{
				em.close();
			}
		}
		
	}

	@Override
	public Metier update(Metier obj)
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		Metier m = null;

		try 
		{
			tx = em.getTransaction();
			tx.begin();
			m = em.merge(obj);
			tx.commit();
		}
		catch(Exception e) 
		{
			if(tx != null && tx.isActive())
			{
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally
		{
			if(em != null && em.isOpen())
			{
				em.close();
			}
		}
		return m;
	}

	@Override
	public void delete(Metier obj)
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;

		try 
		{
			tx = em.getTransaction();
			tx.begin();
			em.remove(em.merge(obj));
			tx.commit();
		}
		catch(Exception e) 
		{
			if(tx != null && tx.isActive())
			{
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally
		{
			if(em != null && em.isOpen())
			{
				em.close();
			}
		}
		
	}

	@Override
	public void deleteByKey(Long key)
	{
		delete(findByKey(key));
	}
	
}
