package week3.day1;

public class Automation extends MultipleLangauge implements Language  {
	
	public void java() {
		
		System.out.println("Java");
	}

	
	public void Selenium() {
		
		System.out.println("Selenium");
		
	}
	
	public void ruby() {
		
		System.out.println("Ruby");
	}
	public static void main(String[] args) {
		
		Automation at=new Automation();
		at.java();
		at.Selenium();
		at.ruby();
		at.python();
		
		
		
		
	}

}
