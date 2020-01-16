package jpa.model;

public class Metier 
{
	private Long idMetier;
	private String titreMetier;
	
	public Metier() 
	{
		super();
	}

	public Long getIdMetier() 
	{
		return idMetier;
	}

	public void setIdMetier(Long idMetier) 
	{
		this.idMetier = idMetier;
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
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMetier == null) ? 0 : idMetier.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metier other = (Metier) obj;
		if (idMetier == null) {
			if (other.idMetier != null)
				return false;
		} else if (!idMetier.equals(other.idMetier))
			return false;
		return true;
	}


	
	
}