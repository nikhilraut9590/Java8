package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamAPI1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("fgeaaa", "", "xzvhdhbbbb", "qrqwrcccc", "zmnfgddddddd", "hheeeee", "");
		List<String> names2 = null;
		// System.out.println(names2.stream());

		Stream<String> stream1 = names.stream();
		//stream1.forEach(System.out::println);

		Stream<String> ss = Stream.generate(() -> "hi").limit(15);
		//ss.forEach(System.out::println);
		
		String s="nik";
		String s1="aa";
		System.out.println(s);
		s="hi";
		s=s1;
		System.out.println(s);
		
		

	}

	public Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

}
