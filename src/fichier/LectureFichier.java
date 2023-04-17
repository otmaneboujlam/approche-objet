package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		ArrayList<Ville> villes = new ArrayList<>();

		Path path = Paths.get("E:\\Diginamic\\JavaObjet\\TP\\recensement.csv");
		boolean exists = Files.exists(path);
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);

		if (exists && estFichier && estLisible) {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			if (lines.size() > 0) {
				Path pathDestination = Paths.get("E:\\Diginamic\\JavaObjet\\TP\\recensementGrandeVille.csv");
				File newFile = new File("E:\\Diginamic\\JavaObjet\\TP\\recensementGrandeVille.csv");
				newFile.createNewFile();
				String[] tokensEnTete = lines.get(0).split(";");
				List<String> enTete = new ArrayList<>();
				enTete.add(tokensEnTete[6] + ";" + tokensEnTete[2] + ";" + tokensEnTete[1] + ";" + tokensEnTete[9]);
				Files.write(pathDestination, enTete, StandardCharsets.UTF_8);
				for (int i = 1; i < lines.size(); i++) {
					String[] tokens = lines.get(i).split(";");
					villes.add(new Ville(tokens[6], Integer.parseInt(tokens[0].replace(" ", "")), tokens[1],
							Integer.parseInt(tokens[9].replace(" ", ""))));

					if (villes.get(i - 1).getPopulationTotale() > 25000) {
						List<String> line = new ArrayList<>();
						line.add(villes.get(i - 1).getNomRegion() + ";" + villes.get(i - 1).getCodeDepartement() + ";"
								+ villes.get(i - 1).getNom() + ";" + villes.get(i - 1).getPopulationTotale());
						Files.write(pathDestination, line, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
					}

				}
			} else {
				System.out.println("Fichier vide");
			}
		} else {
			System.out
					.println("Ressource n'est pas un fichier ou Ressource non trouvée ou Ressource n'est pas visible");
		}

		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}

}
