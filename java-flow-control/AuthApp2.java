
public class AuthApp2 {

	public static void main(String[] args) {
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		String pass2 = "1234";
		
		System.out.println("Hi.");
		boolean isRightPass = inputPass.equals(pass) || inputPass.equals(pass2);
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("Master!");
//			}else {
//				System.out.println("Wrong password!");
//			}
//		}else {
//			System.out.println("Who are you?");
//		}
		
		if(inputId.equals(id) && isRightPass) {
				System.out.println("Master!");
		
		}else {
			System.out.println("Who are you?");
		}

	}

}
