package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class AssFindIntersection {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		for (Integer integer1 : list1) {
			for (Integer integer2 : list2) {
				if (integer1.equals(integer2)) {
					System.out.println(integer1);
			}		
				
			}
		}
	}

}
