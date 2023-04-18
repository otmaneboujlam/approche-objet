package fr.diginamic.automates;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JeuDeLaVie {

	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dimension de la matrice carrée : ");
		int dimensionMatrice = scanner.nextInt();
		System.out.println("Nombre de cellules visibles : ");
		int nombreCellulesVisible = scanner.nextInt();

		ArrayList<Cellule> CellulesList = new ArrayList<>();
		ArrayList<String> positionList = new ArrayList<>();

		for (int i = 0; i < nombreCellulesVisible; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			positionList.add(x + "-" + y);
			CellulesList.add(new Cellule(x, y, true));
		}

		for (int i = 0; i < dimensionMatrice; i++) {
			for (int j = 0; j < dimensionMatrice; j++) {
				if (!positionList.contains(i + "-" + j)) {
					CellulesList.add(new Cellule(i, j, false));
				}
			}
		}

		scanner.close();

		CellulesFactory cellules = new CellulesFactory(CellulesList, positionList);
		System.out.println("\nGeneration : 0\n");
		GererSurvieEtMort gererSurvieEtMort = new GererSurvieEtMort();
		gererSurvieEtMort.traiterSurvieEtMort(cellules);
		GererNaissance gererNaissance = new GererNaissance();
		gererNaissance.traiterNaissane(cellules);
		for (Cellule cellule : cellules.getCellules()) {
			System.out.println(cellule);
		}
		// TODO : Afficher des étoiles

		int compteurGeneration = 1;
		do {
			System.out.println("\nGeneration : " + compteurGeneration + "\n");
			GererPassageNextGeneration gererPassageNextGeneration = new GererPassageNextGeneration();
			gererPassageNextGeneration.traiterPassageNextGeneration(cellules);
			ArrayList<String> newPositionList = new ArrayList<>();
			for (Cellule cellule : cellules.getCellules()) {
				if (cellule.isVisible()) {
					newPositionList.add(cellule.getPositionX() + "-" + cellule.getPositionY());
				}
			}
			cellules.setPositionList(newPositionList);
			GererSurvieEtMort gererSurvieEtMort1 = new GererSurvieEtMort();
			gererSurvieEtMort1.traiterSurvieEtMort(cellules);
			GererNaissance gererNaissance1 = new GererNaissance();
			gererNaissance1.traiterNaissane(cellules);
			for (Cellule cellule : cellules.getCellules()) {
				System.out.println(cellule);
			}
			// TODO : Afficher des étoiles
			compteurGeneration++;
			TimeUnit.SECONDS.sleep(2);
		} while (true);
	}

}
