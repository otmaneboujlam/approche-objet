package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {

		ArrayList<Ville> villes = new ArrayList<>();

		Path path = Paths.get("E:\\Diginamic\\JavaObjet\\TP\\recensement.csv");
		boolean exists = Files.exists(path);
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);

		if (exists && estFichier && estLisible) {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			if (lines.size() > 0) {
				for (int i = 1; i < lines.size(); i++) {
					String[] tokens = lines.get(i).split(";");
					villes.add(new Ville(Integer.parseInt(tokens[0].replace(" ", "")), tokens[1].replace(" ", ""),
							tokens[2].replace(" ", ""), Integer.parseInt(tokens[5].replace(" ", "")),
							tokens[6].replace(" ", ""), Integer.parseInt(tokens[9].replace(" ", ""))));
				}
			} else {
				System.out.println("Fichier vide");
			}
		} else {
			System.out
					.println("Ressource n'est pas un fichier ou Ressource non trouvée ou Ressource n'est pas visible");
		}

		Recensement recensement = new Recensement(villes);
		Scanner scanner = new Scanner(System.in);
		final String MENU = "1. Population d’une ville donnée\n2. Population d’un département donné\n3. Population d’une région donnée\n4. Afficher les 10 régions les plus peuplées\n5. Afficher les 10 départements les plus peuplés\n6. Afficher les 10 villes les plus peuplées d’un département\n7. Afficher les 10 villes les plus peuplées d’une région\n8. Afficher les 10 villes les plus peuplées de France\n9. Sortir";
		boolean continu = true;
		do {
			System.out.println(MENU);
			System.out.println("Votre choix : ");
			int choix = scanner.nextInt();
			switch (choix) {
			case 1:
				RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
				rechercheVille.traiter(recensement, scanner);
				break;

			case 2:
				RecherchePopulationDepartement rechercheDepartement = new RecherchePopulationDepartement();
				rechercheDepartement.traiter(recensement, scanner);
				break;

			case 3:
				RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
				rechercheRegion.traiter(recensement, scanner);
				break;

			case 4:
				RechercheTopRegion rechercheTopRegion = new RechercheTopRegion();
				rechercheTopRegion.traiter(recensement, scanner);
				break;

			case 5:
				RechercheTopDepartement rechercheTopDepartement = new RechercheTopDepartement();
				rechercheTopDepartement.traiter(recensement, scanner);
				break;

			case 6:
				RechercheTopVilleOfDepartement rechercheTopVilleOfDepartement = new RechercheTopVilleOfDepartement();
				rechercheTopVilleOfDepartement.traiter(recensement, scanner);
				break;

			case 7:
				RechercheTopVilleOfRegion rechercheTopVilleOfRegion = new RechercheTopVilleOfRegion();
				rechercheTopVilleOfRegion.traiter(recensement, scanner);
				break;

			case 8:
				RechercheTopVilleOfFrance rechercheTopVilleOfFrance = new RechercheTopVilleOfFrance();
				rechercheTopVilleOfFrance.traiter(recensement, scanner);
				break;

			default:
				scanner.close();
				System.out.println("Au revoir");
				continu = false;
				break;
			}
		} while (continu);
	}

}
