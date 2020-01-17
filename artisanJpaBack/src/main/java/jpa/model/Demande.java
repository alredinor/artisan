package jpa.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqDemande", sequenceName="seq_demande", initialValue = 1, allocationSize = 1)
public class Demande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqDemande")
	private Long idDemande;
	private String message;
	
	@ManyToOne
	@JoinColumn(name="id_compte", foreignKey = @ForeignKey(name="demande_compte_id_fk"))
	private Compte compte;
	
	@OneToOne
	@JoinColumn(name="id_service", foreignKey = @ForeignKey(name="demande_service_id_fk"))
	private Service service;
	
	@OneToOne
	@JoinColumn(name="id_metier", foreignKey = @ForeignKey(name="demande_metier_id_fk"))
	private Metier metier;
	
	public Demande() {
	}

	public Long getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(Long idDemande) {
		this.idDemande = idDemande;
	}

	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDemande == null) ? 0 : idDemande.hashCode());
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
		Demande other = (Demande) obj;
		if (idDemande == null) {
			if (other.idDemande != null)
				return false;
		} else if (!idDemande.equals(other.idDemande))
			return false;
		return true;
	}

	
	
	
	
}
