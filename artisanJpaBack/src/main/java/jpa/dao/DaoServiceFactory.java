package jpa.dao;

public class DaoServiceFactory {
	
	private static DaoService daoService=null;
	
	public static DaoService getInstance() {
		if(daoService==null) {
			daoService=new DaoServiceJpaImp();
		}
		return  daoService;
	}

}
