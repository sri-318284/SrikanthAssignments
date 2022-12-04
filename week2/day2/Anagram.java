package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String text1="stops";
		String text2="potss";
		int strlen1=text1.length();
		int strlen2=text2.length();
		if(strlen1==strlen2) {
			
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result) {
				
				System.out.println("The given strings are anagram");
			}
			
			else {
				
				System.out.println("The given strings are not anagram");
			}
			
		}
		
		else {
			
			System.out.println("The given strings are not anagram");
		}
		

	}

}
