package jpa.model;

public class DemandePK {

	private Service service;
	private Compte client;
	private Compte artisan;
	
	public DemandePK() {
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Compte getClient() {
		return client;
	}

	public void setClient(Compte client) {
		this.client = client;
	}

	public Compte getArtisan() {
		return artisan;
	}

	public void setArtisan(Compte artisan) {
		this.artisan = artisan;
	}

	
	
	
}
