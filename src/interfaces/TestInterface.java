package interfaces;

public class TestInterface {

	public static void main(String[] args) {

		Cercle c = new Cercle(3.5);
		Rectangle r = new Rectangle(2.01, 45.69);

		System.out.println(c.perimetre());
		System.out.println(c.surface());
		System.out.println(r.perimetre());
		System.out.println(r.surface());
	}

}
