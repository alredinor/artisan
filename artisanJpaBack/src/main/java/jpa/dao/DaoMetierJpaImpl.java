package jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import jpa.model.Metier;
import jpa.util.JpaContext;

public class DaoMetierJpaImpl implements DaoMetier
{

	@Override
	public Metier findBykey(Long key) 
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Metier obj) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Metier update(Metier obj)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Metier obj) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByKey(Long key) 
	{
		// TODO Auto-generated method stub
		
	}
	
}
