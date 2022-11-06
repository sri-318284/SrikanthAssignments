package week1.day1;

public class MyMobile {

	public void makeCall()
	{

		System.out.println("Making a call");
	}

	public void sendMsg()
	{

		System.out.println("Sending a Message");
	}

	public static void main(String[] args) {

		MyMobile myMobile=new MyMobile();
		myMobile.makeCall();
		myMobile.sendMsg();

	}

}
