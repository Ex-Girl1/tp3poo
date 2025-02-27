package ma.projet.organisation;

import ma.project.org.Personne;

public class Etudiant extends Personne {
	private String cne;
	private Filiere filiere;
	

	public Etudiant(int id, String nom, String prenom, String telephone, String email, String cne, Filiere filiere) {
		super(id, nom, prenom, telephone, email);
	     this.cne = cne;
	     this.filiere = filiere;
	     
	}


	public String getCne() {
		return cne;
	}
	public String getNom() {
        return nom; 
    }

	public void setCne(String cne) {
		this.cne = cne;
	}


	public Filiere getFiliere() {
		return filiere;
	}


	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}


	@Override
	public String toString() {
		return cne + " " + super.toString();
	}


	


	
	
	
}

