package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int arr1[]= {12,76,43,21,98};
		int arr2[]= {31,21,98,87,43,65};
		int sizeOfArray1=arr1.length;
		int sizeOfArray2=arr2.length;
		for(int i=0;i<sizeOfArray1;i++) {
			
			for(int j=0;j<sizeOfArray2;j++) {
				
				if(arr1[i]==arr2[j]) {
					
					System.out.println(arr1[i]);
				}
			}
		}
		
		

	}

}
