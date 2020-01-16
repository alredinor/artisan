package jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class Service {

	@Id
	private long idService;
	@Column(name="metier")
	private String Metier;


<<<<<<< HEAD
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



public Service() {
	super();
}
=======
	public long getIdService() {
		return idService;
	}


	public void setIdService(long idService) {
		this.idService = idService;
	}


	public String getMetier() {
		return Metier;
	}


	public void setMetier(String metier) {
		Metier = metier;
	}


	public Service() {
		super();
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
>>>>>>> nicolas

}
