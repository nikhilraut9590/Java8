package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCustomerUsingStreamAPI {

	public static void main(String[] args) {
		Customer cust1 = new Customer(103, "laptop", 32000.25);
		Customer cust2 = new Customer(102, "refridge", 56000.25);
		Customer cust3 = new Customer(104, "cellphone", 22000.50);
		Customer cust4 = new Customer(101, "bike", 95000.00);
		Customer cust5 = new Customer(106, "bike", 95000.00);

		List<Customer> list = new ArrayList<Customer>();
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		list.add(cust4);
		list.add(cust5);

		double total = list.stream().collect(Collectors.summingDouble(cust -> cust.getBill()));
		System.out.println(total);

		list.stream().filter(x -> x.getBill() < 32000.25).forEach(x -> System.out.println(x.getBill()));

		Customer cust6= list.stream().max((b1, b2) -> b1.getBill() > b2.getBill() ? 1 : -1).get();
		System.out.println("Max bill Customer: "+cust6);
		
		Customer cust7= list.stream().min((b1, b2) -> b1.getBill() > b2.getBill() ? 1 : -1).get();
		System.out.println("Min bill Customer: "+cust7);
		
		Set<Customer> setCust=list.stream().collect(Collectors.toSet());
		System.out.println(setCust.size());
		
		Map<Integer, Customer> productPriceMap = list.stream()
			    .collect(Collectors.toMap(x->x.getCustId(),x->x));
			  System.out.println(productPriceMap);
			  
			  Set<String> pro=list.stream().map(x->x.getProname()).collect(Collectors.toSet());
			  pro.forEach(x->System.out.print(x+" "));
			  
	}

}
