package week1.day2;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		
		int arr[]= {23,12,76,42,18};
		int size=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		int secondLargest=arr[size-2];
		System.out.println("Second Largest number in the array is " +secondLargest);
	}

}
