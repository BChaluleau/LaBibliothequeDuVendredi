package application;

import bibliotheque.Bibliotheque;
import bibliotheque.Exemplaire;
import bibliotheque.Ouvrage;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lancement...");
		Bibliotheque toutePetite = new Bibliotheque(3);
		Bibliotheque uneAutre = new Bibliotheque(3);

		System.out.println(toutePetite.getNbOuvrages()); // 0
		System.out.println(toutePetite.getOuvrages().length); // 3

		Ouvrage o1 = new Ouvrage("Titre1", "Auteur1", "Editeur1", 2026, "ISBN_1");
		Ouvrage o2 = null; // o2 est une variable, de type Ouvrage qui contient null
		System.out.println(o2);
		o2 = o1; // o2 et o1 "pointent" vers le même Ouvrage
		o2 = new Ouvrage("Titre2", "Auteur2", "Editeur2", 2026, "ISBN_2"); // appel au constructeur

		Exemplaire e1 = new Exemplaire("COTE_1");
		Exemplaire e2 = new Exemplaire("COTE_2");

		toutePetite.ajouteOuvrage(o1);
		o1.ajouteExemplaire(e1);
		o2.ajouteExemplaire(e2);
		uneAutre.ajouteOuvrage(o2);

		System.out.println(toutePetite); // afficher représentation textuelle Bibliotheque
		System.out.println(uneAutre);

	}

}
