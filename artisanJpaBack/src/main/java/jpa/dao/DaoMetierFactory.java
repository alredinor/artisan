package jpa.dao;

public class DaoMetierFactory 
{
	
		private static DaoMetier daoMetier = null;
		
		public static DaoMetier getInstance()
		{
			if(daoMetier == null)
			{
				daoMetier = new DaoMetierJpaImpl();
			}
			return new DaoMetierJpaImpl();
		}
	
}
