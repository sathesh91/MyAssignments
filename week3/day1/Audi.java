package week3.day1;

public class Audi extends Car{
	
	public void hybridFuel()
	{
		System.out.println("Fuel is HybridFuel");
	}
	
	public void applyBreak()
	{
		System.out.println("Apply ABS Break Vechicle stop");
	}
	
	
	public void applyParClassBrake()
	{
		super.applyBreak();
	}

}
