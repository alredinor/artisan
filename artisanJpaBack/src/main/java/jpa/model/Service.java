package jpa.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class Service {

	@Id
	private long idService;
	@Column(name="nom_service")
	private String nomService;
	@Embedded
	@Column(name="metier")
	private Metier Metier;




public Service() {
	super();
}

	public long getIdService() {
		return idService;
	}


	public void setIdService(long idService) {
		this.idService = idService;
	}


	public Metier getMetier() {
		return Metier;
	}


	public void setMetier(Metier metier) {
		Metier = metier;
	}



	public String getNomService() {
		return nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Metier == null) ? 0 : Metier.hashCode());
		result = prime * result + (int) (idService ^ (idService >>> 32));
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
		Service other = (Service) obj;
		if (Metier == null) {
			if (other.Metier != null)
				return false;
		} else if (!Metier.equals(other.Metier))
			return false;
		if (idService != other.idService)
			return false;
		return true;
	}


}
