package bibliotheque;

public enum TypeLitteraire {
	// attention à appeler le constructeur privé
	ROMAN("roman"), SF("sci-fi"), THEATRE("théatre");

	private String nom;

	// Enum : constructeurs privés
	private TypeLitteraire(String nom) {
		System.out.println("APPEL EFFECTUE");
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

}
