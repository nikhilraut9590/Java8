package com.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
	public static void main(String[] args) {
		List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13);
		Integer i = primeNumbers.stream().filter(p -> p > 3).findAny().get();
		System.out.println(i);

	}
}
