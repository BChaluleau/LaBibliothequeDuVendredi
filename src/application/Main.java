package application;

import bibliotheque.Bibliotheque;
import bibliotheque.Ouvrage;
import bibliotheque.TypeLitteraire;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lancement...");
		Bibliotheque toutePetite = new Bibliotheque(3);
		Bibliotheque uneAutre = new Bibliotheque(3);

		Ouvrage o1 = toutePetite.ajouteOuvrage("Titre1", "Auteur1", "Editeur1", 2026, "ISBN_1", TypeLitteraire.SF);

		if (o1 != null) {
			o1.ajouteExemplaire();
			o1.ajouteExemplaire();
			o1.ajouteExemplaire();
			o1.ajouteExemplaire();
		}
		// un jour on fera un lien Ocaml et POO
		toutePetite.ajouteOuvrage("Titre2", "Auteur2", "Editeur2", 2026, "ISBN_2", TypeLitteraire.THEATRE)
				.ajouteExemplaire();

		uneAutre.ajouteOuvrage("Titre3", "Auteur3", "Editeur3", 2026, "ISBN_3", TypeLitteraire.ROMAN)
				.ajouteExemplaire();

		System.out.println(toutePetite); // afficher représentation textuelle Bibliotheque
		System.out.println(uneAutre);

	}

}
