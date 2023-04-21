package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique tableauObjetGeometrique[] = { new Cercle(5.6), new Rectangle(4.8, 7.4) };
		for (ObjetGeometrique objetGeometrique : tableauObjetGeometrique) {
			System.out.println(objetGeometrique.perimetre() + " " + objetGeometrique.surface());
		}

	}

}
