package bibliotheque;

import java.util.Arrays;

public class Bibliotheque {
	// attributs, tous privés
	private int nbOuvrages = 0; // initialisation par défaut, SOUS LA RESP. DE LA CLASSE
	private int nbOuvragesMax; // dépend de la bibliotheque
	private Ouvrage[] ouvrages; // Null ici, on ne connait pas sa taille

	public Bibliotheque(int nbOuvragesMax) { // constructeur de la classe Bibliotheque
		System.out.println("Nouvelle bibliotheque " + nbOuvragesMax);
		this.nbOuvragesMax = nbOuvragesMax; // self. en Python
		ouvrages = new Ouvrage[nbOuvragesMax]; // instanciation du tableau
	}

	// ajout de deux get sur le nbOuvrage et le Ouvrage[]
	public int getNbOuvrages() {
		return nbOuvrages;
	}

	public Ouvrage[] getOuvrages() {
		return ouvrages;
	}

	public void ajouteOuvrage(Ouvrage ouvrage) {
		ouvrages[nbOuvrages] = ouvrage; // this pas obligatoire (pas d'ambiguité)
		nbOuvrages++;
	}

	@Override
	public String toString() {
		return "Bibliotheque [ouvrages=" + Arrays.toString(ouvrages) + "]";
	}

}
