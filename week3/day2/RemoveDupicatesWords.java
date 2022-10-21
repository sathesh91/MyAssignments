package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupicatesWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("The given input text is : "+text);
		
		//Split method
		String[] textSplit = text.split(" ");
		
		// LinkedHashSet -> Maintain Insertion Order
		Set<String> st = new LinkedHashSet<String>();

		//for each loop
		for(String getOneVal : textSplit)
		{
		st.add(getOneVal);
		}
		
		StringBuilder sb = new StringBuilder();
		
		//for each loop
        for (String eachText : st) {
        	sb.append(eachText).append(" ");
        }
        String finText = sb.toString();
        
        System.out.println("String Without Duplicates words : " + finText);


	}

}
