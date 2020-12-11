class foo{
	public static String classVar = "I calss var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // Ok
//		System.out.println(instanceVar); //Error
	}
	public void instanceMethod() {
		System.out.println(classVar); // Ok
		System.out.println(instanceVar); //Ok
	}
}


public class StaticApp {

	public static void main(String[] args) {
		
		System.out.println(foo.classVar);  // Ok
//		System.out.println(foo.instanceVar); //Error
		foo.classMethod();//Ok
//		foo.instanceMethod();//Error
		
		foo f1 = new foo();
		f1.instanceMethod();
		foo f2 = new foo();
		System.out.println(f1.classVar);// I class var
		System.out.println(f1.instanceVar);// I instance var
		
		f1.classVar = "changed by f1";
		System.out.println(foo.classVar);//chaged by f1
		System.out.println(f2.classVar);//changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);//changed by f1
		System.out.println(f2.instanceVar);//I instance var
		
		
	}

}
