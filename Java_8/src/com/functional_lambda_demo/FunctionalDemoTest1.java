package com.functional_lambda_demo;

public class FunctionalDemoTest1 implements Poet,Writer{

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		Poet.super.write();
	}

}

interface Poet{
	void aa();
	default void write() {
		System.out.println("A interface method");
	}
}

interface Writer{
	void aa();
	default void write() {
		System.out.println("B interface method");
	}
}