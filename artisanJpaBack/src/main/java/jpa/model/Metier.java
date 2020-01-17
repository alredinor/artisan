package jpa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="metier")
@Embeddable
public class Metier extends Compte
{
	
	@Column(name="titre_metier", length=150)
	private String titreMetier;
	
	@OneToMany
	private Set<Service> services;
	
	private Integer experience;
	
	public Metier() 
	{
		super();
	}
	
	

	public Integer getExperience() {
		return experience;
	}



	public void setExperience(Integer experience) {
		this.experience = experience;
	}



	public Set<Service> getServices() {
		return services;
	}



	public void setServices(Set<Service> services) {
		this.services = services;
	}




	public String getTitreMetier() 
	{
		return titreMetier;
	}

	public void setTitreMetier(String titreMetier)
	{
		this.titreMetier = titreMetier;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((experience == null) ? 0 : experience.hashCode());
		result = prime * result + ((services == null) ? 0 : services.hashCode());
		result = prime * result + ((titreMetier == null) ? 0 : titreMetier.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metier other = (Metier) obj;
		if (experience == null) {
			if (other.experience != null)
				return false;
		} else if (!experience.equals(other.experience))
			return false;
		if (services == null) {
			if (other.services != null)
				return false;
		} else if (!services.equals(other.services))
			return false;
		if (titreMetier == null) {
			if (other.titreMetier != null)
				return false;
		} else if (!titreMetier.equals(other.titreMetier))
			return false;
		return true;
	}

	
	
}
