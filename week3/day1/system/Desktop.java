package week3.day1.system;

public class Desktop {

	public static void main(String[] args) {
		
		Computer comp = new Computer();
		comp.dellDesktop();
		comp.hpDesktop();
		comp.lenovaDesktop();
		comp.macDesktop();
		comp.asusDesktop();
		comp.acerDesktop();
		comp.intelDesktop();
		
		Desktop desk = new Desktop();
		desk.desktopSize18();
		desk.desktopSize20();
		desk.lenovaDesktopAbove20();
	}
	
	public void desktopSize18()
	{
		System.out.println("Screen Size 18");
	}
	
	public void desktopSize20()
	{
		System.out.println("Screen Size 20");
	}
	
	public void lenovaDesktopAbove20()
	{
		System.out.println("Screen Sie above 20");
	}
	
}
