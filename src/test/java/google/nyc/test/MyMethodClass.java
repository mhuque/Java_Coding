package google.nyc.test;

public class MyMethodClass {
	
	public static void main(String[] args) {
		
		//How to create object for void method
		TestClass obj = new TestClass();
		obj.testMethod();
		obj.testing();
		obj.returnMethod();
		
		//How to crate object for non void or static method
		TestClass.hello();
		
		
	}

}
