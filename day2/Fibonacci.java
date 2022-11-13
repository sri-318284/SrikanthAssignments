package week1.day2;

public class Fibonacci {
	
	
	
		

	public static void main(String[] args) {
		
		int range=8;
		int firstNum=0;
		int secondNum=1;
		int sum=0;;
		
		for(int i=1;i<range;i++) {
			
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
			
		}
		
		System.out.println("Fibonacci series is "+sum);

	}

}
