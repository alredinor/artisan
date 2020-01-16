package jpa;

import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
import jpa.model.Client;
import jpa.model.Compte;
import jpa.util.JpaContext;

public class TestNico {

	public static void main(String[] args) {
		
		JpaContext.getInstance();
		DaoCompte daoCompte=DaoCompteFactory.getInstance();
		
		
		Compte c= new Client();
		c.setLogin("nico");
		c.setMdp("2006");
		daoCompte.insert(c);
		
		JpaContext.destroy();
	}

}
