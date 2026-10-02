package bibliotheque;

public class Exemplaire {

	private String cote;
	private boolean empruntable = true; // par défaut un exemplaire va être empruntable
	private boolean enLigne = false;

	// instanciable par le package
	protected Exemplaire(String cote) {
		System.out.println("Nouvel exemplaire " + cote);
		this.cote = cote;
	}

	// généré automatiquement
	public boolean isEmpruntable() {
		return empruntable;
	}

	public void setEmpruntable(boolean empruntable) {
		this.empruntable = empruntable;
	}

	public boolean isEnLigne() {
		return enLigne;
	}

	public void setEnLigne(boolean enLigne) {
		this.enLigne = enLigne;
	}

	public String getCote() {
		return cote;
	}

	@Override
	public String toString() {
		return cote;
	}

}
