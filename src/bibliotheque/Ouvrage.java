package bibliotheque;

public class Ouvrage {
	private String titre;
	private String auteurs;
	private String editeur;
	private int annee;
	private String isbn;

	private int nbExemplaires = 0;
	private static final int NB_EXEMPLAIRES_MAX = 50; // static = la même pour toutes les classes, final = constante
	// la taille max est la même pour tous les Ouvrages, j'initialise mon tableau
	private Exemplaire[] exemplaires = new Exemplaire[NB_EXEMPLAIRES_MAX];

}
