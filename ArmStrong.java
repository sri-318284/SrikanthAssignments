package week1.day2;

public class ArmStrong {

	public static void main(String[] args) {
		
		int input=153;
		int calculated=0,remainder,original;
		original=input;
		
		while(original>0) {
			
			remainder=original%10;
			original=original/10;
			calculated=calculated+(remainder*remainder*remainder);
			
			
		}
		
		if(calculated==input) {
			
			System.out.println("Given number is armstrong");
		}

		else {
			
			System.out.println("Given number is not armstrong");
		}
	}

}
