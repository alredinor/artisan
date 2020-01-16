package jpa.model;

public class DemandePK {

	private Service idService;
	private Compte idClient;
	private Compte idArtisan;
	
	public DemandePK() {
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
	
	
}
