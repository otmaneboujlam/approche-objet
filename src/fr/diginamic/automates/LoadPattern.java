package fr.diginamic.automates;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LoadPattern {

	private ArrayList<Cellule> CellulesList = new ArrayList<>();
	private ArrayList<String> positionList = new ArrayList<>();
	private int dim = 20;
	private int nombreCelluleVisible = 0;

	public void loadPattern(Path path) throws IOException {
		boolean exists = Files.exists(path);
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);

		if (exists && estFichier && estLisible) {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			Iterator<String> ite = lines.iterator();
			while (ite.hasNext()) {
				String valeur = ite.next();
				if (valeur.startsWith("!")) {
					ite.remove();
				}
			}
			ArrayList<Integer> dims = new ArrayList<>();
			dims.add(lines.size());
			for (String line : lines) {
				dims.add(line.length());
			}
			Collections.sort(dims);
			this.dim = dims.get(dims.size() - 1);
			for (int i = 0; i < lines.size(); i++) {
				for (int x = 0; x < lines.get(i).length(); x++) {
					if (lines.get(i).charAt(x) == 'O') {
						this.setNombreCelluleVisible(this.getNombreCelluleVisible() + 1);
						int y = lines.size() - 1 - i;
						this.positionList.add(x + "-" + y);
						this.CellulesList.add(new Cellule(x, y, true));
					}
				}
			}
		} else {
			System.out
					.println("Ressource n'est pas un fichier ou Ressource non trouvée ou Ressource n'est pas visible");
		}
	}

	public int getDim() {
		return dim;
	}

	public void setDim(int dim) {
		this.dim = dim;
	}

	public ArrayList<Cellule> getCellulesList() {
		return CellulesList;
	}

	public void setCellulesList(ArrayList<Cellule> cellulesList) {
		CellulesList = cellulesList;
	}

	public ArrayList<String> getPositionList() {
		return positionList;
	}

	public void setPositionList(ArrayList<String> positionList) {
		this.positionList = positionList;
	}

	public int getNombreCelluleVisible() {
		return nombreCelluleVisible;
	}

	public void setNombreCelluleVisible(int nombreCelluleVisible) {
		this.nombreCelluleVisible = nombreCelluleVisible;
	}
}
