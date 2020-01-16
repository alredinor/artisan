package jpa.dao;

public class DaoCompteFactory {
	
	private static DaoCompte daoCompte=null;
	
	public static DaoCompte getInstance() {
		if(daoCompte==null) {
			daoCompte=new DaoCompteJPA();
		}
		return  daoCompte;
	}

}
