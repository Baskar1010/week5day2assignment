package week5.day2assignment;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void java() {
		System.out.println("java");
	
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
 public static void main(String[] args) {
	
	 Automation java = new Automation();
	 java.Selenium();
	 java.java();
	 java.ruby();
}
}
