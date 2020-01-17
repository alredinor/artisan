package jpa.dao;

import java.util.List;

import jpa.model.Artisan;
import jpa.model.Metier;
import jpa.model.Service;

public interface DaoArtisan  extends DaoGeneric<Artisan, Long>
{
	public List<Metier> findAllMetier();
	public List<Service> findAllService();
}
