package ma.projet.organisation;

import ma.project.org.Document;

public class Dictionnaire extends Document {
    private String langue;

    public Dictionnaire(String titre, String langue) {
        super(titre);
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "Dictionnaire{" +
                "numEnreg=" + getNumEnreg() +
                ", titre='" + getTitre() + '\'' +
                ", langue='" + langue + '\'' +
                '}';
    }

}
