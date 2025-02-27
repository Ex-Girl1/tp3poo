package ma.project.test;

import java.util.Scanner;

import ma.project.org.Document;
import ma.projet.organisation.Bibliotheque;
import ma.projet.organisation.Manuel;
import ma.projet.organisation.Roman;

public class TestBib {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de documents: ");
        int n = sc.nextInt();
        Bibliotheque bibliotheque = new Bibliotheque(n);

       
        bibliotheque.ajouter(new Roman("Les Misérables", "Victor Hugo", 1234, 19.99));
        bibliotheque.ajouter(new Manuel("Mathématiques", "Jean Dupont", 500, "Lycée"));

        int choix;
        do {
            System.out.println("Menu:");
            System.out.println("1. Afficher les documents");
            System.out.println("2. Ajouter un document");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Afficher les auteurs");
            System.out.println("0. Quitter");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    bibliotheque.afficherDocuments();
                    break;
                case 2:
                	System.out.print("Choisissez le type de document à ajouter (1: Roman, 2: Manuel): ");
                    int type = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Titre: ");
                    String titre = sc.nextLine();
                    System.out.print("Auteur: ");
                    String auteur = sc.nextLine();
                    System.out.print("Nombre de pages: ");
                    int nbrPages = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Prix: ");
                        double prix = sc.nextDouble();
                        bibliotheque.ajouter(new Roman(titre, auteur, nbrPages, prix));
                    } else if (type == 2) { 
                        System.out.print("Niveau: ");
                        String niveau = sc.next();
                        bibliotheque.ajouter(new Manuel(titre, auteur, nbrPages, niveau));
                    } else {
                        System.out.println("Type de document invalide.");
                    }
                    break;
                case 3:
                    
                    System.out.print("Entrez le numéro d'enregistrement du document à supprimer: ");
                    int numEnrg = sc.nextInt();
                    Document docASupprimer = bibliotheque.document(numEnrg);
                    if (docASupprimer != null) {
                        bibliotheque.supprimer(docASupprimer);
                        System.out.println("Document supprimé avec succès.");
                    } else {
                        System.out.println("Document non trouvé.");
                    }
                    break;
                case 4:
                    bibliotheque.afficherAuteurs();
                    break;
                case 0:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        } while (choix != 0);

        sc.close();
    }
}
