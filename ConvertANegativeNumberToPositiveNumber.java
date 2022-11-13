package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		
		int inputNumber=-70;
		if(inputNumber<0) {
			
			inputNumber= -(inputNumber);
			
		}
		
		System.out.println("Converted positive number is " +inputNumber);

	}

}
