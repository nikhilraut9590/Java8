package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapIterateTestJava8 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("zik", 9);
		map.put("nih", 3);
		map.put("bik", 6);
		map.put("eik", 1);
		map.put("qik", 5);
		
		
		//map.forEach((k,v)->System.out.println(k+ " : "+v));
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,n)->o,LinkedHashMap::new))
		.forEach((k,v)->System.out.println(k+" : "+v));;
	}

}
