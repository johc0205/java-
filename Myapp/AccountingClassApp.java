import javax.swing.JOptionPane;


public class AccountingClassApp {

	
	public static void main(String[] args) {
		Accounting a1 = new Accounting();
		a1.valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("돈을 입력하시오 : "));
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("돈을 입력하시오 : "));
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		
		
	}

	
}
