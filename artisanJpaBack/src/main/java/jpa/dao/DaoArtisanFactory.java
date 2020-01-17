package jpa.dao;

public class DaoArtisanFactory {
	
	private static DaoArtisan daoArtisan=null;
	
	public static DaoArtisan getInstance() {
		if(daoArtisan==null) {
			daoArtisan=new DaoArtisanJpaImpl();
		}
		return  daoArtisan;
	}

}
