
public class EqualApp {

	public static void main(String[] args) {

		String o1 = "Java";
		String o2 = "Java";
		
		String o3 = new String("java1");
		String o4 = new String("java1");
		
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		
		System.out.println(o3 == o4);
		System.out.println(o3.equals(o4));

	}

}
