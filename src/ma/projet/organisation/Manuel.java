package ma.projet.organisation;

import ma.project.org.Livre;

public class Manuel extends Livre {
    private String niveau;

    public Manuel(String titre, String auteur, int nbrPages, String niveau) {
        super(titre, auteur, nbrPages);
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Manuel{" +
                "numEnreg=" + getNumEnreg() +
                ", titre='" + getTitre() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", nbrPages=" + nbrPages +
                ", niveau='" + niveau + '\'' +
                '}';
    }

}
