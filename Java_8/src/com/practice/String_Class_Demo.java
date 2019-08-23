package com.practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class String_Class_Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String..");
		String str = scanner.next();

		countStringOccurence(str);

	}
	private static void countStringOccurence(String str) {
		HashMap<Character, Integer> hashCount = new HashMap<>();
		char[] chArray = str.toCharArray();
		int len = chArray.length;

		for (int i = 0; i < len; i++) {

			if (hashCount.containsKey(chArray[i])) {
				hashCount.put(chArray[i], hashCount.get(chArray[i]) + 1);
			} else {
				hashCount.put(chArray[i], 1);
			}
		}
		Set<Entry<Character, Integer>> count = hashCount.entrySet();
		for (Entry<Character, Integer> s : count) {
			System.out.println(s.getKey() + "  :  " + s.getValue());
		}
	}
}
