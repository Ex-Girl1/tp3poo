package ma.project.test;

import ma.projet.organisation.Etudiant;
import ma.projet.organisation.Filiere;

public class Test {
	
	    public static void main(String[] args) {
	    	 Filiere filiereIAII = new Filiere(1, "IAII", "Ingénierie des automatismes et informatique industrielle");
	         Filiere filiereIRT = new Filiere(2, "IRT", "Ingénierie des réseaux et télécommunications");
	         Filiere filiere2ITE = new Filiere(3, "2ITE", "Ingénierie informatique et technologies émergentes");

	      
	         Etudiant etu1 = new Etudiant(1, "safi", "amal", "0601020304", "amal.safi@mail.com", "22885676", filiereIAII);
	         Etudiant etu2 = new Etudiant(2, "alami", "samir", "0612345678", "samir.alami@mail.com", "23585976", filiereIRT);
	         Etudiant etu3 = new Etudiant(3, "ben", "ahmed", "0623456789", "ahmed.ben@mail.com", "24585976", filiere2ITE);
	         Etudiant etu4 = new Etudiant(4, "tazi", "nour", "0634567890", "nour.tazi@mail.com", "25859776", filiereIAII);

	         
	         System.out.println("La liste des étudiants de la filière " + filiereIAII.getLibelle() + " est :");
	         System.out.println(etu1.getNom().toUpperCase() + " " + capitalizeFirstLetter(etu1.getPrenom()) + " (CNE: " + etu1.getCne() + ")");
	         System.out.println(etu4.getNom().toUpperCase() + " " + capitalizeFirstLetter(etu4.getPrenom()) + " (CNE: " + etu4.getCne() + ")");
	         System.out.println();

	       
	         System.out.println("La liste des étudiants de la filière " + filiereIRT.getLibelle() + " est :");
	         System.out.println(etu2.getNom().toUpperCase() + " " + capitalizeFirstLetter(etu2.getPrenom()) + " (CNE: " + etu2.getCne() + ")");
	         System.out.println();

	         
	         System.out.println("La liste des étudiants de la filière " + filiere2ITE.getLibelle() + " est :");
	         System.out.println(etu3.getNom().toUpperCase() + " " + capitalizeFirstLetter(etu3.getPrenom()) + " (CNE: " + etu3.getCne() + ")");
	     }

	     
	     private static String capitalizeFirstLetter(String str) {
	         if (str == null || str.length() == 0) {
	             return str;
	         }
	         return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	     }
	 }
	
