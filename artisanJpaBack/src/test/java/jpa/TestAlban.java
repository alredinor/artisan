package jpa;

import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
import jpa.dao.DaoDemande;
import jpa.dao.DaoDemandeFactory;
import jpa.dao.DaoMetier;
import jpa.dao.DaoMetierFactory;
import jpa.dao.DaoService;
import jpa.dao.DaoServiceFactory;
import jpa.model.Metier;
import jpa.util.JpaContext;

public class TestAlban {
	public static void main(String[] args) {
		
		JpaContext.getInstance();
		
		DaoCompte daoCompte=DaoCompteFactory.getInstance();
		DaoService daoService=DaoServiceFactory.getInstance();
		DaoMetier daoMetier=DaoMetierFactory.getInstance();
		DaoDemande daoDemande=DaoDemandeFactory.getInstance();
		
//		Compte a= new Artisan();
//		a.setLogin("jordan");
//		a.setMdp("root");
//		a.setEmail("jordan@gmail.com");
//		
//		Adresse adr= new Adresse();
//		adr.setNumero(12);
//		adr.setCodePostal("92350");
//		adr.setRue("ici");
//		adr.setVille("Paris");
//		a.setAdresse(adr);
		
		Metier m= new Metier();
		m.setTitreMetier("luthiste");
		daoMetier.insert(m);
		
		// FIN DES TRAITEMENTS
		JpaContext.destroy();
	}
}
