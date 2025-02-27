package ma.projet.organisation;

import ma.project.org.Document;
import ma.project.org.Livre;

public class Bibliotheque {
	private int capacite;
    private Document[] documents;
    private int count;
	public Document[] getDocuments() {
		return documents;
	}
	public void setDocuments(Document[] documents) {
		this.documents = documents;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.documents = new Document[capacite]; 
        this.count = 0;
    }

    public void afficherDocuments() {
        for (int i = 0; i < count; i++) {
            System.out.println(documents[i]);
        }
    }

    public boolean ajouter(Document doc) {
        if (count < capacite) {
            documents[count++] = doc; 
            return true;
        }
        return false;
    }

    public boolean supprimer(Document doc) {
        for (int i = 0; i < count; i++) {
            if (documents[i].getNumEnreg() == doc.getNumEnreg()) {
                documents[i] = documents[count - 1]; 
                documents[count - 1] = null; 
                count--;
                return true;
            }
        }
        return false;
    }

    public Document document(int numEnrg) {
        for (int i = 0; i < count; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }
        return null;
    }

    public void afficherAuteurs() {
        for (int i = 0; i < count; i++) {
            if (documents[i] instanceof Livre) {
                System.out.println(((Livre) documents[i]).getAuteur());
            }
        }
    }
	

}
