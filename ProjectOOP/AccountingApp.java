class Accounting{
	public double valueOfSupply;
    
    public static double vatRate = 0.1;
    
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    
    public double getVAT() {
        return this.valueOfSupply * vatRate;
    }
    
    public double getTotal() {
        return this.valueOfSupply + getVAT();
    }
    public void print() {
    	System.out.println("Value of supply : " + this.valueOfSupply);
    	System.out.println("VAT : "+this.getVAT());
    	System.out.println("Total : "+ this.getTotal());
    }
}

public class AccountingApp{
    public static void main(String[] args) {
    	Accounting a1 = new Accounting(10000.0);
    	a1.print();
    	Accounting a2 = new Accounting(20000.0);     
    	a2.print();
    
    }
}
