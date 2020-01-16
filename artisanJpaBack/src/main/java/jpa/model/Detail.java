package jpa.model;

public class Detail {
	
	private DetailPK key;
	private String statut;
	
	
	public Detail() {
		
	}

	
	
	public Detail(DetailPK key, String statut) {
		this.key = key;
		this.statut = statut;
	}



	public DetailPK getKey() {
		return key;
	}


	public void setKey(DetailPK key) {
		this.key = key;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}

	
	
	
}
