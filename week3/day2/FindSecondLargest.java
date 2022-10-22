package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> st = new LinkedHashSet<Integer>();
		for(int eachData : data)
			st.add(eachData);
		List<Integer> list = new ArrayList<Integer>(st);
		Collections.sort(list);
		System.out.println("SecondLargest value : "+list.get(list.size()-2));
	}
}
