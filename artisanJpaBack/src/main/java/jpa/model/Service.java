package jpa.model;

public class Service {
private long idService;
private Metier Metier;



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

}
