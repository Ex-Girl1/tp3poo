package ma.projet.organisation;

import ma.project.org.Personne;

public class Formateur extends Personne{
	  private String matricule;
	  private Matiere matiere;
	  


	public Formateur(int id, String nom, String prenom, String telephone, String email, String matricule,
			Matiere matiere) {
		super(id, nom, prenom, telephone, email);
		this.matricule = matricule;
		this.matiere = matiere;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public Matiere getMatiere() {
		return matiere;
	}


	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}


	@Override
	public String toString() {
		return matricule + " " + super.toString();
	}
	

}
