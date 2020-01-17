package jpa;

import java.util.Scanner;

import jpa.dao.DaoCompte;
import jpa.dao.DaoCompteFactory;
import jpa.dao.DaoCompteJpaImpl;
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
		
//		Service s = new Service();
//		Service s2 = new Service();
//		Service s3 = new Service();
//		
//		s.setNomService("Maconnerie");
//		s2.setNomService("Serurier");
//		s3.setNomService("Decorateur");
//		
//		daoService.insert(s);
//		daoService.insert(s2);
//		daoService.insert(s3);
//		Compte c= new Client();
//		c.setLogin("tete");
//		c.setMdp("2222");
//		c.setEmail("tete@nico.fr");
//		
//		Adresse a= new Adresse();
//		a.setNumero(5);
//		a.setCodePostal("31000");
//		a.setRue("balma");
//		a.setVille("Toulouse");
//		c.setAdresse(a);
//		
//		Metier m1=new Metier();
//		Metier m2=new Metier();
//		m1.setTitreMetier("Plomberie");
//		m2.setTitreMetier("Electricité");
//		
//		daoMetier.insert(m1);
//		daoMetier.insert(m2);

	}

}
