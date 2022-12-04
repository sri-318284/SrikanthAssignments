package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student details are "+id);
	}
	
public void getStudentInfo(int id,String name) {
		
		System.out.println("Student id is "+id +" and name is " +name);
	}


public void getStudentInfo(String email,long phoneNumber) {
	
	System.out.println("Student email id is  "+email+ " and Phone number is " +phoneNumber);
}

	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentInfo(90);
		st.getStudentInfo(34, "srikanth");
		st.getStudentInfo("sri@gmail.com", 8988788800l);
		

	}

}
