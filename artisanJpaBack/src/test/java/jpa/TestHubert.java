package jpa;

import java.util.Scanner;

import jpa.dao.DaoClient;
import jpa.dao.DaoClientFactory;
import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
import jpa.dao.DaoCompteJpaImpl;
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
import jpa.model.Metier;
import jpa.model.Service;
import jpa.util.JpaContext;

public class TestHubert {
	
	public static int saisieInt(String msg) {
		Scanner sc= new Scanner(System.in);
		System.out.println(msg);
		return sc.nextInt();
	}


	public static double saisieDouble(String msg) {
		Scanner sc= new Scanner(System.in);
		System.out.println(msg);
		return sc.nextDouble();
	}


	public static String saisieString(String msg) {
		Scanner sc= new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}
	
	/*menu de connexion*/
	public static void menuConnect() {
		
		String nom = "";
        String password = "";

        DaoCompteJpaImpl daoCompte = new DaoCompteJpaImpl();

        nom=saisieString("Saisir votre login");
        password=saisieString("Saisir password");
		
	}

	public static void main(String[] args) {
		
		JpaContext.getInstance();
		DaoCompte daoCompte=DaoCompteFactory.getInstance();
		DaoService daoService=DaoServiceFactory.getInstance();
		DaoMetier daoMetier=DaoMetierFactory.getInstance();
		DaoClient daoClient =DaoClientFactory.getInstance();
		DaoDemande daoDemande=DaoDemandeFactory.getInstance();
		
		Compte c= new Client();
		c.setLogin("tete");
		c.setMdp("2222");
		c.setEmail("tete@nico.fr");
		Adresse a= new Adresse();
		a.setNumero(5);
		a.setCodePostal("31000");
		a.setRue("balma");
		a.setVille("Toulouse");
		c.setAdresse(a);
		daoCompte.insert(c);
		
		Metier m1=new Metier();
		Metier m2=new Metier();
		m1.setTitreMetier("Plombier");
		m2.setTitreMetier("Electricien");
		daoMetier.insert(m1);
		daoMetier.insert(m2);
		
		
		Service s = new Service();
		Service s2 = new Service();
		Service s3 = new Service();
		s.setNomService("Plomberie");
		s2.setNomService("Serurier");
		s3.setNomService("Electricite");
		daoService.insert(s2);
		daoService.insert(s3);
		
		s.setMetier(daoMetier.findByKey(1L));
		daoService.insert(s);
		System.out.println(daoClient.findAll());
		
	}

}
