package com.functional_lambda_demo;

public class LambdaDemoTest {
	public static void main(String[] args) {

		Demo demo = (String name) -> 
			 "Hello "+name;
		
		System.out.println(demo.hello("Nik"));
	}
}

interface Demo {
	String hello(String name);
}