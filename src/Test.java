
public class Test {

	public static void main(String[] args) {

		String s1 = "hello world";
		System.out.println(s1.hashCode());
		s1 = "bye bye world";
		System.out.println(s1.hashCode());
		String s3 = "bye bye world";
		System.out.println(s3.hashCode());
		String s2 = "    Hello world";
		s2.trim();
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s2.hashCode());
		System.out.println((s2.trim()).hashCode());
		s2 = s2.trim();
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}

}
