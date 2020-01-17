package jpa;

import java.util.Scanner;
import jpa.dao.DaoCompteJpaImpl;

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
		
		System.out.println("Bonjour Hubert");

	}

}
