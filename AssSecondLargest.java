package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssSecondLargest {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(3);
		numberList.add(2);
		numberList.add(11);
		numberList.add(4);
		numberList.add(6);
		numberList.add(7);
		
		Collections.sort(numberList);
		
		int size = numberList.size();
		System.out.println(numberList.get(size-2));
		
	}

}

//2 3 4 6 7 11
