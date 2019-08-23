package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("fgeaaa", "","xzvhdhbbbb", "qrqwrcccc", "zmnfgddddddd", "hheeeee","");
		List<String> names2 = names.stream().filter(p -> p.length() > 4).map(p -> p.toUpperCase() + "_hello").sorted()
				.collect(Collectors.toList());
		System.out.println(names2);

		String min = names.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println(min);
		
		names.stream().forEach(s->System.out.print(s+" : "));
		
		names.stream().forEach(System.out::print);
		System.out.println("************************");
		String[] s=names.stream().toArray(String[]::new);
		for(String s1:s) {
			System.out.println(s1);
		}
		
		long count=names.stream().filter(e->e.isEmpty()).count();
		System.out.println(count);
	}
}
