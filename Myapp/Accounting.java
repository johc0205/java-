class Accounting{
	public  double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend1 : "+getDiviend1());
		System.out.println("Dividend2 : "+getDiviend2());
		System.out.println("Dividend3 : "+getDiviend3());
	}

	public double getDiviend1() {
		return getIncome()*0.5;
	}
	public double getDiviend2() {
		return getIncome()*0.3;
	}
	public double getDiviend3() {
		return getIncome()*0.2;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply*vatRate;
	}

}