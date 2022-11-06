/*Assignment1
Create a class for TwoWheeler and declare below variables with appropriate values
int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM
create object for TwoWheeler and call all the variables inside main method and print the values.*/

package week1.day1;
public class TwoWheeler {
	
	/* Global Variables declaration outside of main method*/
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=76767676787l;
	boolean isPunctured=false;
	String bikeName= "Honda Shine SP";
	double runningKM=18764.25;
	

	public static void main(String[] args) {
		
		/* creating an object for TwoWheeler class inside main method to call all the global variables and print their values */
		
		TwoWheeler twoWheeler=new TwoWheeler();
		System.out.println(twoWheeler.noOfWheels);
		System.out.println(twoWheeler.noOfMirrors);
		System.out.println(twoWheeler.chassisNumber);
		System.out.println(twoWheeler.isPunctured);
		System.out.println(twoWheeler.bikeName);
		System.out.println(twoWheeler.runningKM);
		

	}

}
