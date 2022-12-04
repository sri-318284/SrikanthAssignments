package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsapp()
	{
		
		System.out.println("Connect to whatsapp");
	}

	
	public void takeVideo()
	{
		
		System.out.println("Take a video in smart phone");
	}

	
	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone();
		sp.connectWhatsapp();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		
	}
}
