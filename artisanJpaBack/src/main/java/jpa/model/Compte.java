package jpa.model;

public class Compte {
	
	private Long idCompte;
	private String login;
	private String mdp;
	private String email;
	private Adresse adresse;
	private String typeCompte;
	
	public Compte() {
		
	}

	public Compte(String login, String mdp, String email, Adresse adresse, String typeCompte) {
		super();
		this.login = login;
		this.mdp = mdp;
		this.email = email;
		this.adresse = adresse;
		this.typeCompte = typeCompte;
	}

	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCompte == null) ? 0 : idCompte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (idCompte == null) {
			if (other.idCompte != null)
				return false;
		} else if (!idCompte.equals(other.idCompte))
			return false;
		return true;
	}
	
}
