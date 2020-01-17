package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import jpa.model.Artisan;
import jpa.model.Metier;
import jpa.model.Service;
import jpa.util.JpaContext;

public class DaoArtisanJpaImpl implements DaoArtisan
{

	@Override
	public Artisan findByKey(Long key) 
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();	
		Artisan a = null;
		a = em.find(Artisan.class, key);
		em.close();
		return a;
	}

	@Override
	public List<Artisan> findAll() 
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();
		List<Artisan> artisans = null;
		Query query = em.createQuery("from Artisan a");
		artisans = query.getResultList();
		em.close();
		return artisans;
	}

	@Override
	public void insert(Artisan obj) 
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
	public Artisan update(Artisan obj) 
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();
		EntityTransaction tx = null;
		Artisan a = null;

		try 
		{
			tx = em.getTransaction();
			tx.begin();
			a = em.merge(obj);
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
		return a;
	}

	@Override
	public void delete(Artisan obj) 
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
	
	public List<Metier> findAllMetier() 
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();	
		Query query = em.createQuery("select m from Metier m");
		List<Metier> metiers = null;
		metiers = query.getResultList();
		em.close();
		return metiers;
	}
	
	public List<Service> findAllService() 
	{
		EntityManager em = JpaContext.getInstance().createEntityManager();	
		Query query = em.createQuery("select s from Service s");
		List<Service> services = null;
		services = query.getResultList();
		em.close();
		return services;
	}

}
