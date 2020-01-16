package jpa.model;

public class Demande {
	
	private DemandePK key;
	private Long idDemande;
	private String message;
	
	public Demande() {
	}

	public Long getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(Long idDemande) {
		this.idDemande = idDemande;
	}

	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDemande == null) ? 0 : idDemande.hashCode());
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
		Demande other = (Demande) obj;
		if (idDemande == null) {
			if (other.idDemande != null)
				return false;
		} else if (!idDemande.equals(other.idDemande))
			return false;
		return true;
	}

	
	
	
	
}
