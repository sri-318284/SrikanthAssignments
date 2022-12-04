package week2.day2;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String str="luffy is still joyboy";
		
		String[] splitWords=str.split(" ");
		for(int i=0;i<splitWords.length;i++) {
			
			System.out.println(splitWords[i]);
		}
		
		System.out.println("Length of last word joyboy is "+splitWords[splitWords.length-1].length());
		

	}

}
