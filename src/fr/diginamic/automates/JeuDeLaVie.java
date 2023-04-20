package fr.diginamic.automates;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JeuDeLaVie {

	public static void affihcerMatrice(ArrayList<String> positionListString, int dimensionMatrice) {

		for (int i = dimensionMatrice - 1; i >= 0; i--) {
			ArrayList<Integer> listPositionY = new ArrayList<>();
			String indexI = String.valueOf(i);
			for (String s : positionListString) {
				if (s.split("-")[1].equals(indexI)) {
					listPositionY.add(Integer.parseInt(s.split("-")[0]));
				}
			}
			for (int j = 0; j < dimensionMatrice; j++) {
				if (listPositionY.contains(j)) {
					System.out.print("\u2B1B");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		ArrayList<Cellule> CellulesList = new ArrayList<>();
		ArrayList<String> positionList = new ArrayList<>();
		System.out.println("Veuillez entrer le nom du fichier de configuration : (Voir dossier ressources)");
		Scanner clavier = new Scanner(System.in);
		String nomFichier = clavier.next();
		clavier.close();
		// Path path = Paths.get("E:\\Diginamic\\JavaObjet\\TP\\all\\" + nomFichier +
		// ".cells");
		String filePath = ClassLoader.getSystemClassLoader()
				.getResource("fr/diginamic/automates/resources/" + nomFichier + ".cells").getFile().substring(1);
		System.out.println(filePath);
		LoadPattern pattern = new LoadPattern();
		Path path = Paths.get(filePath);
		pattern.loadPattern(path);
		CellulesList = pattern.getCellulesList();
		positionList = pattern.getPositionList();
		for (int i = 0; i < pattern.getDim(); i++) {
			for (int j = 0; j < pattern.getDim(); j++) {
				if (!positionList.contains(i + "-" + j)) {
					CellulesList.add(new Cellule(i, j, false));
				}
			}
		}
		CellulesFactory cellules = new CellulesFactory(CellulesList, positionList);
		System.out.println("\nGeneration : 0\n");
		GererSurvieEtMort gererSurvieEtMort = new GererSurvieEtMort();
		gererSurvieEtMort.traiterSurvieEtMort(cellules);
		GererNaissance gererNaissance = new GererNaissance();
		gererNaissance.traiterNaissane(cellules);
		affihcerMatrice(cellules.getPositionList(), pattern.getDim());
		TimeUnit.SECONDS.sleep(1);
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
			affihcerMatrice(cellules.getPositionList(), pattern.getDim());
			compteurGeneration++;
			TimeUnit.SECONDS.sleep(1);
		} while (true);
	}
}
