package jpa;

import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
import jpa.dao.DaoService;
import jpa.dao.DaoServiceFactory;
import jpa.util.JpaContext;

public class TestAlban {
	public static void main(String[] args) {
		JpaContext.getInstance();
		DaoCompte daoCompte=DaoCompteFactory.getInstance();
		DaoService daoService=DaoServiceFactory.getInstance();
		JpaContext.destroy();
	}
}
