package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class TestCombat {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		Personnage personnage = new Personnage("Champion", new Random().nextInt(7) + 12, new Random().nextInt(31) + 20,
				0);
		boolean continu = true;
		do {
			System.out.println("1. Creer le personnage\n2. Combattre une creature\n3.Afficher score\n99.Sortir");
			System.out.println("Votre choix : ");
			int choix = clavier.nextInt();
			switch (choix) {
			case 1:
				personnage = new Personnage("Champion", new Random().nextInt(7) + 12, new Random().nextInt(31) + 20, 0);
				System.out.println(personnage);
				break;
			case 2:
				if (personnage.getPointsVie() >= 0) {
					Creature creature = new Creature("Loup", new Random().nextInt(6) + 3, new Random().nextInt(6) + 5);
					System.out.println("1.Combattre un loup\n2. Combattre un gobelin\n3.Combattre un troll");
					System.out.println("Votre choix : ");
					int choixCreature = clavier.nextInt();
					if (choixCreature == 1) {
						creature = new Creature("Loup", new Random().nextInt(6) + 3, new Random().nextInt(6) + 5);
					} else if (choixCreature == 2) {
						creature = new Creature("Gobelin", new Random().nextInt(6) + 5, new Random().nextInt(6) + 10);
					} else {
						creature = new Creature("Troll", new Random().nextInt(6) + 10, new Random().nextInt(11) + 20);
					}
					Combat combat = new Combat(personnage, creature);
					combat.lancerCombat();
					combat.gererCombat();
				} else {
					System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore()
							+ " points. Veuillez créer un nouveau personnage");
				}
				break;
			case 3:
				System.out.println("Votre personnage a obtenu le score de " + personnage.getScore());
				break;
			default:
				System.out.println("Au revoir");
				continu = false;
				clavier.close();
				break;
			}
		} while (continu);
	}
}
