import javax.swing.JOptionPane;

public class AuthApp3 {

	public static void main(String[] args) {
		
		//String[] users = {"egoing","hyeongcheol", "jo"};
		String [][] users = {
				{"egoing","1111"},
				{"hyeongcheol","2222"},
				{"jo","3333"}
		};
		String inputID = JOptionPane.showInputDialog("이름을 입력하시오 : ");
		String inputPass = JOptionPane.showInputDialog("비밀번호를 임력하시오 : ");
		boolean isLogined = false;
		for(int i = 0 ; i < users.length; i++) {
			String[] current = users[i];
			if( current[0].equals(inputID)&&current[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi!");
		if(isLogined) {
			System.out.println("Correct!");
		}else {
			System.out.println("Wrong!");
		}
	}

}
