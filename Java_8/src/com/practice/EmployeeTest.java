package com.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"ABC");
		Employee e2=new Employee(109,"UFB");
		Employee e3=new Employee(103,"ZTY");
		Employee e4=new Employee(108,"MGF");
		Employee e5=new Employee(132,"TGF");
		System.out.println(e2.equals(e1));
		
		Map<Employee, String> emp_map=new HashMap<Employee, String>();
		emp_map.put(e1, "e1");
		emp_map.put(e2, "e2");
		emp_map.put(e3, "e3");
		emp_map.put(e4, "e4");
		emp_map.put(e5, "e5");
		
		Comparator<Employee> comp=Comparator.comparing(Employee::geteName).thenComparing(Employee::getEmpId);
		
		emp_map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(comp))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,n)->o,LinkedHashMap::new))
		.forEach((k,v)->System.out.println(k+" : "+v));
	}

}
