package week1.day2;

public class MyCalculator {
	
	// shortc ut to save in local variable is ctrl+2; tap L;

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println("Sum of given 3 values is " +cal.addition(10, 20, 30));
		//cal.addition(10, 20, 30);
		System.out.println("Subtraction  of given two numbers is  " + cal.subtraction(20, 10));
		System.out.println("Multiplication of given two numbers is " +cal.multiplication(32.1, 12.1));
		System.out.println("Division of given two numbers is "+ cal.division(34.24f, 17.15f));
		
	}

}
