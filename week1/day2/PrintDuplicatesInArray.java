package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int len = arr.length;
		
		//Ascending order
		Arrays.sort(arr);
		
		// declare an int variable named count
		int count;
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int i=0; i<len-1;i++)
		{
			count=0;
			for(int j=i+1;j<len-1;j++)
			{	
				if (arr[i] == arr[j])
				count = count+1;
		   }
			if(count==1)
				System.out.println("Array dupicated values are: " +arr[i]);
		}
	}
}
