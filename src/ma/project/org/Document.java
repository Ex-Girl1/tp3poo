package ma.project.org;

public class Document {
	private static int compteur = 0;
    private int numEnreg;
    private String titre;

    public Document(String titre) {
        this.titre = titre;
        this.numEnreg = ++compteur;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numEnreg=" + numEnreg +
                ", titre='" + titre + '\'' +
                '}';
    }
}
