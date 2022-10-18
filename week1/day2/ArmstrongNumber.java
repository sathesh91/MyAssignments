package week1.day2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int calculated=0, remainder, input, original;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input :");
		input=sc.nextInt();
		sc.close();
		
		for(original=input;original!=0;original=original/10)
		{
			remainder=original%10;
			calculated= calculated+remainder*remainder*remainder;
		}
		if(input==calculated)
			System.out.println("The given input is Amstrong Number");
		else
			System.out.println("The given input is not an Amstrong Number! Check with other input");
	}

}