package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
	public static void main(String[] args) {
		/*
		 * List<String> list = Arrays.asList("india", "australia", "palistan", "",
		 * "west-indies", "south-africa", "", "afganistan", "");
		 * 
		 * // count the empty string long counterEmptystring = list.stream().filter(e ->
		 * e.isEmpty()).count(); System.out.println("count the empty string: " +
		 * counterEmptystring);
		 * 
		 * // Count String with length more than 3 long countLengthMoreThan3 =
		 * list.stream().filter(s -> s.length() > 6).count();
		 * System.out.println("Count String with length more than 3: " +
		 * countLengthMoreThan3);
		 * 
		 * // Count number of String which startswith "a"
		 * System.out.println("Count number of String which startswith \"a\": " +
		 * list.stream().filter(e -> e.startsWith("a")).count());
		 * 
		 * // Remove all empty Strings from List List removeAllEmptystring =
		 * list.stream().filter(e -> !e.isEmpty()).collect(Collectors.toList());
		 * System.out.println(" Remove all empty Strings from List: " +
		 * removeAllEmptystring);
		 * 
		 * //convert string to uppercase String
		 * upper=list.stream().filter(e->!e.isEmpty()).map(x->x.toUpperCase()).collect(
		 * Collectors.joining(",")); System.out.println(upper);
		 * 
		 * List uppercase=list.stream().map(x->x.toUpperCase()).filter(x->!x.isEmpty()).
		 * collect(Collectors.toList()); System.out.println(uppercase);
		 */
		/*
		 * List<Integer>
		 * intList=Arrays.asList(12,54,85,64,75,85,94,35,159,654,325,785,147,963);
		 * //List res=intList.stream().filter(x->x%2==0).collect(Collectors.toList());
		 * IntSummaryStatistics
		 * intSummaryStatistics=intList.stream().mapToInt((x)->x).summaryStatistics();
		 * int res=intList.stream().mapToInt((x)->x).max().getAsInt();
		 * System.out.println(res);
		 */
		
		
		
		List<String> result = Stream.of("EURO/INR", "USD/AUD", "USD/GBP", "USD/EURO")
		        .filter(e -> e.length() > 7)
		        .peek(e -> System.out.println("Filtered value: " + e))
		        .map(String::toLowerCase)
		        .peek(e -> System.out.println("Mapped value: " + e))
		        .collect(Collectors.toList());
		
		List<String> result2=result.stream().filter(x->x.startsWith("E") || x.length()>7).collect(Collectors.toList());
		System.out.println(result2);
	}
}
