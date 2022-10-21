package week3.day2.Interface;

public class Automation extends MultipleLanguage{

	public static void main(String[] args) {
		
		System.out.println("This is Automation Class");
		Automation automate = new Automation();
		automate.java();
		automate.javaScript();
		automate.ruby();
		automate.phyton();
		automate.perl();
		automate.testTool();
		automate.selenium();
		
		Language lang = new Automation();
		
		System.out.println("This is Interface language sharing the memory with Automation Class");
		lang.java();
		lang.javaScript();
		lang.ruby();
		lang.testTool();
		lang.selenium();
		
		MultipleLanguage multiLang = new MultipleLanguage();
		System.out.println("This is MultipleLanguage Class");
		multiLang.java();
		multiLang.javaScript();
		multiLang.ruby();
		multiLang.phyton();
		multiLang.testTool();
		multiLang.selenium();
		
		Language mmultiLang = new MultipleLanguage();
		System.out.println("This is Interface Language sharing the memory with Multiple Class");
		mmultiLang.java();
		mmultiLang.javaScript();
		mmultiLang.ruby();
		mmultiLang.testTool();
		mmultiLang.selenium();
		
	}
	
	public void perl()
	{
		System.out.println("Learn perl");
	}

}
