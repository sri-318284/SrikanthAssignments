package week1.day1;

/*Assignment2
Create a class for Mobile and declare below variables with appropriate values
String mobileBrandName
char mobileLogo
short noOfMobilePiece
int modelNumber
long mobileImeiNumber
float mobilePrice
boolean isDamaged
create object for Mobile and call all the variables inside main method and print the values.*/

public class Mobile {
	
	/* Global Variables declaration outside of main method*/
	String mobileBrandName="One Plus";
	char mobileLogo='O';
	short noOfMobilePiece=2;
	int modelNumber=1901;
	long mobileImeiNumber= 78687676898l;
	float mobilePrice=38000f;
	boolean isDamaged=false;
	

	public static void main(String[] args) {
		
		/* creating an object for Mobile class inside main method to call all the global variables and print their values */
	
		Mobile myMobile=new Mobile();
		System.out.println(myMobile.mobileBrandName);
		System.out.println(myMobile.mobileLogo);
		System.out.println(myMobile.noOfMobilePiece);
		System.out.println(myMobile.modelNumber);
		System.out.println(myMobile.mobilePrice);
		System.out.println(myMobile.isDamaged);
		
	}

}
