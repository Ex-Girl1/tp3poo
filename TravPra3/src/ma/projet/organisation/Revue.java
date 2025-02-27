package ma.projet.organisation;

import ma.project.org.Document;

public class Revue extends Document {
    private String mois;
    private int annee;

    public Revue(String titre, String mois, int annee) {
        super(titre);
        this.mois = mois;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Revue{" +
                "numEnreg=" + getNumEnreg() +
                ", titre='" + getTitre() + '\'' +
                ", mois='" + mois + '\'' +
                ", annee=" + annee +
                '}';
    }
}
