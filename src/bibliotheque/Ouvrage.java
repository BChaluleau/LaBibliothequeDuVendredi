package bibliotheque;

import java.util.Arrays;

public class Ouvrage { // classe Ouvrage : nouveau type disponible !
	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;

	private int nbExemplaires = 0;
	private static final int NB_EXEMPLAIRES_MAX = 50; // static = la même pour toutes les classes, final = constante
	// la taille max est la même pour tous les Ouvrages, j'initialise mon tableau
	private Exemplaire[] exemplaires = new Exemplaire[NB_EXEMPLAIRES_MAX];

	public Ouvrage(String titre, String auteurs, String editeur, int annee, String isbn) {
		System.out.println("Nouvel ouvrage " + titre);
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
	}

	public void ajouteExemplaire(Exemplaire ex) {
		exemplaires[nbExemplaires] = ex;
		nbExemplaires++;
	}

	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", exemplaires=" + Arrays.toString(exemplaires) + "]";
	}

}
