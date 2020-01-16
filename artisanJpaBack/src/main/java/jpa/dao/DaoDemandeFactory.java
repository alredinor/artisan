package jpa.dao;

public class DaoDemandeFactory {

	private static DaoDemande daoDemande=null;
	public static DaoDemande getInstance(){
		if(daoDemande==null) {
			daoDemande=new DaoDemandeJpaImpl();
		}
		
		return new DaoDemandeJpaImpl();
	}
}
