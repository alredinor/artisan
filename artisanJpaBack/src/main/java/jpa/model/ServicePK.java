package jpa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Embeddable
public class ServicePK implements Serializable{

//	@ManyToOne
//	@JoinColumn(name="id_service", foreignKey = @ForeignKey(name="metier_id_service_id_fk"))
//	private Service idService;
	@ManyToOne
	@JoinColumn(name="id_metier", foreignKey = @ForeignKey(name="service_id_metier_id_fk"))
	private Metier metier;
	
	
	
	public ServicePK() {
	}



	public Metier getMetier() {
		return metier;
	}



	public void setMetier(Metier metier) {
		this.metier = metier;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((metier == null) ? 0 : metier.hashCode());
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
		ServicePK other = (ServicePK) obj;
		if (metier == null) {
			if (other.metier != null)
				return false;
		} else if (!metier.equals(other.metier))
			return false;
		return true;
	}
	
	

	
	
	
	
	
}
