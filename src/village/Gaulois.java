package village;

public class Gaulois {

	private String nom;
	private int force;
	private Village village = null;

	public Gaulois(String nom, int force) {
		this.force = force;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}

	public void sePresenter() {
		if (this.village == null) {
			System.out.println("Bonjour, je m'appelle " + this.getNom() + "Je voyage de villages en villages");
		} else if (this.village.getChef() == this) {
			System.out.println("Bonjour, je m'appelle " + this.getNom() + ". Je suis le chef " + this.village.getNom());
		} else {
			System.out.println("Bonjour, je m'appelle " + this.getNom() + ". J'habite le village " + this.village.getNom());
		}
	}

	public void frapper(Romain romain) {

	}

	@Override
	public String toString() {
		return nom;
	}

}
