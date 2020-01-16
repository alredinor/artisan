package jpa.model;

import java.io.Serializable;

public class DetailPK implements Serializable{
	
	private Demande demande;
	private Service service;
	
	public DetailPK() {}

	public DetailPK(Demande demande, Service service) {
		this.demande = demande;
		this.service = service;
	}

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
}
