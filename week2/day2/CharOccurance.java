package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str="welcome to chennai";
		int count=0;
		char[] charArray = str.toCharArray();
		int len=charArray.length;
		for(int i=0;i<len;i++) {
			
			if(charArray[i]=='e') {
				
				count++;
				
			}
		}
		
		
		System.out.println("No of occurances of character e in given string is " +count);
	}

}

