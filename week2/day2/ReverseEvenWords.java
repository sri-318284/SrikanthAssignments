package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String revstr="";
		String[] split = test.split(" ");
		for(int i=0;i<split.length;i++) {
			
			if(i%2!=0) {
				
				System.out.println(split[i]);
				char[] charArray = split[i].toCharArray();
				for(int j=split[i].length()-1;j>=0;j--) {
					
					revstr=revstr+charArray[j];
					
				}
				
				System.out.println("Reverse of even words is " +revstr);
			}
			
			
		}
		
		

	}

}
