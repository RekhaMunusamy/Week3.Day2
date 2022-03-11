package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class AssRemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		//int count = 0; 
		String[] split = text.split(" ");

		Set<String> removeDup = new LinkedHashSet<String>();

		for (String string : split) { removeDup.add(string); }

		System.out.println(removeDup);


	}

}
