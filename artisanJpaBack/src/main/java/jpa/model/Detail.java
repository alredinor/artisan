package jpa.model;

public class Detail {
	private long idService;
	private long idDemande;
	private String statut;
	
	
	public Detail() {
		super();
	}


	public long getIdService() {
		return idService;
	}


	public void setIdService(long idService) {
		this.idService = idService;
	}


	public long getIdDemande() {
		return idDemande;
	}


	public void setIdDemande(long idDemande) {
		this.idDemande = idDemande;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	
	
}
