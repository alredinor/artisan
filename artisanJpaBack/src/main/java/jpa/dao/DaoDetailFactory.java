package jpa.dao;

public class DaoDetailFactory {

	private static DaoDetail daoDetail=null;
	public static DaoDetail getInstance(){
		if(daoDetail==null) {
			daoDetail=new DaoDetailJpaImpl();
		}
		
		return new DaoDetailJpaImpl();
	}
}
