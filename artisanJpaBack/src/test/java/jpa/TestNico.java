package jpa;

import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
import jpa.dao.DaoDemande;
import jpa.dao.DaoDemandeFactory;
import jpa.dao.DaoMetier;
import jpa.dao.DaoMetierFactory;
import jpa.dao.DaoService;
import jpa.dao.DaoServiceFactory;
import jpa.model.Adresse;
import jpa.model.Artisan;
import jpa.model.Client;
import jpa.model.Compte;
import jpa.model.Demande;
import jpa.model.Metier;
import jpa.model.Service;
import jpa.util.JpaContext;

public class TestNico {

	public static void main(String[] args) {
		
		JpaContext.getInstance();
		DaoCompte daoCompte=DaoCompteFactory.getInstance();
		DaoService daoService=DaoServiceFactory.getInstance();
		DaoDemande daoDemande=DaoDemandeFactory.getInstance();
		DaoMetier daoMetier=DaoMetierFactory.getInstance();
		
		Service s = new Service();
		Service s2 = new Service();
		Service s3 = new Service();
		
		s.setNomService("Plomberie");
		s2.setNomService("Menuiserie");
		s3.setNomService("Electricite");
		
		daoService.insert(s);
		daoService.insert(s2);
		daoService.insert(s3);
		
		Metier m = new Metier();
		Metier m2 = new Metier();
		Metier m3 = new Metier();
		
		m.setTitreMetier("Menuisier");
		m2.setTitreMetier("Electricien");
		m3.setTitreMetier("Plombier");
		
		daoMetier.insert(m);
		daoMetier.insert(m2);
		daoMetier.insert(m3);
		
		Compte c= new Client();
		c.setLogin("nico");
		c.setMdp("2006");
		c.setEmail("nico@nico.fr");
		Adresse a= new Adresse();
		a.setNumero(1);
		a.setCodePostal("95");
		a.setRue("la");
		a.setVille("Paris");
		c.setAdresse(a);
	
		Compte art= new Artisan();
		art.setLogin("toto");
		art.setMdp("3007");
		art.setEmail("toto@nico.fr");
		Adresse ad= new Adresse();
		ad.setNumero(1);
		ad.setCodePostal("91");
		ad.setRue("ici");
		ad.setVille("Paris");
		art.setAdresse(ad);
		
		daoCompte.insert(art);
		daoCompte.insert(c);
		
		Demande d =new Demande();
		
		d.setArtisan(daoCompte.findByKey(art.getIdCompte()));
		d.setClient(daoCompte.findByKey(c.getIdCompte()));
		d.setService(daoService.findByKey(1L));
		d.setMetier(daoMetier.findByKey(3L));
		d.setMessage("blabla");
	
		daoDemande.insert(d);
		
		JpaContext.destroy();
	}

}
