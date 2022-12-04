package week3.day1;

public class Car extends Vehicle {
	
	public void OpenSunRoof()
	{
		
		System.out.println("Open sun roof");
	}

	public static void main(String[] args) {
		
		Car car=new Car();
		car.applyBrake();
		car.soundHorn();
		car.OpenSunRoof();
		

	}

}
