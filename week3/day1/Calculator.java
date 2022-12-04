package week3.day1;

public class Calculator {
	
	
	public void add(int num1,int num2) {
		
		System.out.println("Addition of 2 numbers is "+(num1+num2));
	}
	
    public void add(int num1,int num2,int num3) {
		
		System.out.println("Addition of 3 numbers is "+(num1+num2+num3));
	}
    
    public void sub(double num1, double num2) {
    	
    	System.out.println("subtraction of 2 numbers is "+(num1-num2));
    }
    
    public void sub(int num1, int num2) {
    	
    	System.out.println("subtraction of 2 numbers is "+(num1-num2));
    }
    
    public void mul(int num1, double num2) {
    	
    	System.out.println("multiplication of 2 numbers is "+(num1*num2));
    }

    public void mul(double num1, double num2) {
    	
    	System.out.println("multiplication of 2 numbers is "+(num1*num2));
    }
    

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.add(20, 30);
		cal.add(30, 40, 50);
		cal.sub(0.87, 0.76);
		cal.sub(43,31);
		cal.mul(0.87, 2);
		cal.mul(4, 3.98);
		
			

	}

}
