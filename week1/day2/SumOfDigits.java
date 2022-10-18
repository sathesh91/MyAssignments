package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		
	    int input=123, sum=0, remainder;
	    
	    System.out.println("Find the sum of digits: "+input);
	    
	    while(input>0)
	    {
	    	remainder = input%10;
	    	sum = sum + remainder;
	    	input = input/10;
	    }
	   System.out.println("The Sum of Digits is " +sum);
		
	}

}