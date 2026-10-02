package bibliotheque;

import java.util.Arrays;

public class Ouvrage { // classe Ouvrage : nouveau type disponible !
	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;

	private TypeLitteraire type;

	private int nbExemplaires = 0;
	private static final int NB_EXEMPLAIRES_MAX = 3; // static = la même pour toutes les classes, final = constante
	// la taille max est la même pour tous les Ouvrages, j'initialise mon tableau
	private Exemplaire[] exemplaires = new Exemplaire[NB_EXEMPLAIRES_MAX];

	// constructeur protected: uniquement dans le même package
	protected Ouvrage(String titre, String auteurs, String editeur, int annee, String isbn, TypeLitteraire type) {
		System.out.println("Nouvel ouvrage " + titre);
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
		this.type = type;
	}

	private void ajouteExemplaire(Exemplaire ex) {
		if (nbExemplaires >= NB_EXEMPLAIRES_MAX) {
			System.err.println("Il y a déjà trop d'exemplaires");
			return;
		}
		exemplaires[nbExemplaires] = ex;
		nbExemplaires++;
	}

	public void ajouteExemplaire() {
		ajouteExemplaire(new Exemplaire("COTE_" + (nbExemplaires + 1)));
	}

	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", " + type + ", exemplaires=" + Arrays.toString(exemplaires) + "]";
	}

}
