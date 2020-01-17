package jpa;

import jpa.dao.DaoArtisan;
import jpa.dao.DaoArtisanFactory;
import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
import jpa.dao.DaoMetier;
import jpa.dao.DaoMetierFactory;
import jpa.dao.DaoService;
import jpa.dao.DaoServiceFactory;
import jpa.model.Adresse;
import jpa.model.Artisan;
import jpa.model.Compte;
import jpa.model.Metier;
import jpa.model.Service;
import jpa.util.JpaContext;

public class TestCharley 
{

	public static void main(String[] args) 
	{
		JpaContext.getInstance();
		
		DaoCompte daoCompte=DaoCompteFactory.getInstance();
		DaoService daoService=DaoServiceFactory.getInstance();
		DaoMetier daoMetier=DaoMetierFactory.getInstance();
		DaoArtisan daoArtisan = DaoArtisanFactory.getInstance();
		
//		Service service= daoService.findByKey(2L);
//		System.out.println(service.getIdService());
//		System.out.println(service.getNomService());
//		
//		service.setMetier(daoMetier.findByKey(1L));
//		daoService.update(service);
//		
//		Service s = new Service();
//		Service s2 = new Service();
//		Service s3 = new Service();
//		
//		s.setNomService("Plomberie");
//		s2.setNomService("Menuiserie");
//		s3.setNomService("Electricite");
//	
//		daoService.insert(s);
//		daoService.insert(s2);
//		daoService.insert(s3);
//		
//		Compte c= new Artisan();
//		c.setLogin("toto");
//		c.setMdp("3007");
//		c.setEmail("toto@nico.fr");
//		Adresse a= new Adresse();
//		a.setNumero(1);
//		a.setCodePostal("91");
//		a.setRue("ici");
//		a.setVille("Paris");
//		c.setAdresse(a);
//		daoCompte.insert(c);
//		
//		Metier m = new Metier();
//		Metier m2 = new Metier();
//		Metier m3 = new Metier();
//		
//		m.setTitreMetier("Menuisier");
//		m2.setTitreMetier("Electricien");
//		m3.setTitreMetier("Plombier");
//		
//		daoMetier.insert(m);
//		daoMetier.insert(m2);
//		daoMetier.insert(m3);
		
		System.out.println(daoArtisan.findAllMetier());
		
		JpaContext.destroy();
	}

}
