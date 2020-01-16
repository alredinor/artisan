package jpa.model;

public class Demande {
	
	private Long idDemande;
	private Service idService;
	private Compte idClient;
	private Compte idArtisan;
	private String message;
	
	public Demande() {
	}

	public Long getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(Long idDemande) {
		this.idDemande = idDemande;
	}

	public Service getIdService() {
		return idService;
	}

	public void setIdService(Service idService) {
		this.idService = idService;
	}

	public Compte getIdClient() {
		return idClient;
	}

	public void setIdClient(Compte idClient) {
		this.idClient = idClient;
	}

	public Compte getIdArtisan() {
		return idArtisan;
	}

	public void setIdArtisan(Compte idArtisan) {
		this.idArtisan = idArtisan;
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
		result = prime * result + ((idArtisan == null) ? 0 : idArtisan.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idDemande == null) ? 0 : idDemande.hashCode());
		result = prime * result + ((idService == null) ? 0 : idService.hashCode());
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
		if (idArtisan == null) {
			if (other.idArtisan != null)
				return false;
		} else if (!idArtisan.equals(other.idArtisan))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idDemande == null) {
			if (other.idDemande != null)
				return false;
		} else if (!idDemande.equals(other.idDemande))
			return false;
		if (idService == null) {
			if (other.idService != null)
				return false;
		} else if (!idService.equals(other.idService))
			return false;
		return true;
	}
	
	
	
}
