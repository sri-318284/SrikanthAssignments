package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String inputString="Malayalam";
		String revString="";
		int strlen=inputString.length();
		for(int i=strlen-1;i>=0;i--) {
			
			revString=revString+inputString.charAt(i);
		}
		
		if(inputString.equalsIgnoreCase(revString)) {
			
			System.out.println("Given string is a palindrome");
		}
		
		else {
			System.out.println("Given string is not a palindrome");
		}
		
		
		
		
	}
	
	
}