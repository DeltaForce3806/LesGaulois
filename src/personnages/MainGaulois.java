package personnages;

public class MainGaulois {

	public static void main(String[] args) {

		Gaulois Asterix = new Gaulois("Asterix", 8);

		Gaulois Obelix = new Gaulois("Obélix", 16);
		
		Asterix.parler("Bonjour Obélix.");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?)");
		Asterix.parler("Oui très bonne idée.");
		
		System.out.println("=================================================");

		Romain Minus = new Romain("Minus", 6);

		System.out.println("Dans la forêt " + Asterix + " et " + Obelix + " tombent nez à nez sur le romain Minus");

		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Minus);
		}
		
		System.out.println("=================================================");
		
		Romain Brutus = new Romain("Brutus", 14);

		Druide Panoramix = new Druide("Panoramix", 2);

		Panoramix.fabriquerPotion(4, 3);

		Panoramix.boosterGaulois(Obelix);
		Panoramix.boosterGaulois(Asterix);
		
		System.out.println("=================================================");

		for (int i = 0; i < 3; i++) {
			Asterix.frapper(Brutus);
		}
	}

}
