package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		String compName="google";
		char[] ch=compName.toCharArray();
		Set<String> stringSet=new HashSet<String>();
		for(int i=0;i<ch.length;i++) {
			
			String s=String.valueOf(ch[i]);
			stringSet.add(s);
			
		}
		
		
		System.out.println(stringSet);
		
		
		
	}

}
