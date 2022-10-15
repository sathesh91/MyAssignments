package week3.day1;

public class LearnOverloading {

	public static void main(String[] args) {
		
		LearnOverloading ovrlod = new LearnOverloading();
		ovrlod.add(5, 4);
		ovrlod.add(5, 4, 3);
		ovrlod.add(1.1f, 2.5f);
		ovrlod.add(5, 2.5f);
	}
	
	public void add(int a, int b)
	{
	 System.out.println("add two interger values");	
	}

	public void add(int a, int b , int c)
	{
		 System.out.println("add three interger values");	
	}
	
	public void add(float a, float b)
	{
		 System.out.println("add two float values");	
	}
	
	public void add(int a, float b)
	{
		 System.out.println("add one interger and one float values");	
	}
}
