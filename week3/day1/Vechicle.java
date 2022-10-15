package week3.day1;

public class Vechicle {

	public static void main(String[] args) {
		System.out.println("Vechicle Class");
		Vechicle vc = new Vechicle();
		vc.applyBreak();
		vc.soundHorn();
		
		System.out.println("Car Class");
		Car cr =new Car();
		cr.applyBreak();
		cr.turnOnAC();
		cr.openSunroof();
		cr.soundHorn();
		
		System.out.println("BMW Class");
		BMW bw = new BMW();
		bw.applyBreak();
		bw.soundHorn();
		bw.turnOnAC();
		bw.openSunroof();
		bw.autoPark();

		System.out.println("Audi Class");
		Audi ad = new Audi();
		ad.applyBreak();
		ad.applyParClassBrake();
		ad.soundHorn();
		ad.turnOnAC();
		ad.openSunroof();
		ad.hybridFuel();
		
		System.out.println("Auto Class");
		Auto at = new Auto();
		at.applyBreak();
		at.soundHorn();
		at.handStart();	
	}
		
	     public  void applyBreak()
		{
			System.out.println("Apply Normal Break Vechicle stop");
		}
	     
	     public void soundHorn()
	     {
	    	 System.out.println("Apply horn - hear the sound");
	     }

}
