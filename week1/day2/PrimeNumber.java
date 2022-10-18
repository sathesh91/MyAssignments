package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input=4;
		Boolean prime=false;
		for(int i=2;i<=input/2;i++)
		{
			if(input % i == 0)
			{
				prime=true;
				break;
			}
		}
	    if (!prime)
	        System.out.println(input + " is a prime number.");
	      else
	        System.out.println(input + " is not a prime number.");
	}

}
