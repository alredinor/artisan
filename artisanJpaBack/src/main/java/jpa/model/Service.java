package jpa.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="service")
@SequenceGenerator(name="seqService", sequenceName="seq_service", initialValue = 1, allocationSize = 1)
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqService")
	private Long idService;
	@Column(name="nom_service")
	private String nomService;






public Service() {
	super();
}






public Long getIdService() {
	return idService;
}






public void setIdService(Long idService) {
	this.idService = idService;
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
	result = prime * result + ((idService == null) ? 0 : idService.hashCode());
	result = prime * result + ((nomService == null) ? 0 : nomService.hashCode());
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
	if (idService == null) {
		if (other.idService != null)
			return false;
	} else if (!idService.equals(other.idService))
		return false;
	if (nomService == null) {
		if (other.nomService != null)
			return false;
	} else if (!nomService.equals(other.nomService))
		return false;
	return true;
}





}
