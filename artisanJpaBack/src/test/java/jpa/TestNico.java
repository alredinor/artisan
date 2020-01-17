package jpa;

import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
<<<<<<< HEAD
import jpa.dao.DaoService;
import jpa.dao.DaoServiceFactory;
import jpa.model.Adresse;
import jpa.model.Artisan;
=======
import jpa.model.Artisan;
import jpa.model.Client;
>>>>>>> b32bbe34c39c1a97baced90b7294f1016663f77c
import jpa.model.Compte;
import jpa.model.Service;
import jpa.util.JpaContext;

public class TestNico {

	public static void main(String[] args) {
		
		JpaContext.getInstance();
		DaoCompte daoCompte=DaoCompteFactory.getInstance();
		DaoService daoService=DaoServiceFactory.getInstance();
		
		Service s = new Service();
		Service s2 = new Service();
		Service s3 = new Service();
		
		s.setNomService("Plomberie");
		s2.setNomService("Menuiserie");
		s3.setNomService("Electricite");
		
		daoService.insert(s);
		daoService.insert(s2);
		daoService.insert(s3);
		
		Compte c= new Artisan();
		c.setLogin("toto");
		c.setMdp("3007");
		c.setEmail("toto@nico.fr");
		Adresse a= new Adresse();
		a.setNumero(1);
		a.setCodePostal("91");
		a.setRue("ici");
		a.setVille("Paris");
		c.setAdresse(a);
		daoCompte.insert(c);
		
		
		
<<<<<<< HEAD
=======
//		Compte c= new Artisan();
//		c.setLogin("nico");
//		c.setMdp("2006");
//		daoCompte.insert(c);
		
>>>>>>> b32bbe34c39c1a97baced90b7294f1016663f77c
		JpaContext.destroy();
	}

}
