package com.method_reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Student {
	String name;
	int age;

	public void setName(String name) {
		this.name = name;

	}

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+": "+getAge();
	}

	public static void main(String[] args) {
		Supplier<Student> stu = Student::new;
		stu.get();
		Student s1 = new Student("djb",15);
		Student s2 = new Student("djb",54);
		Student s3 = new Student("eturt",65);
		Student s4 = new Student("zgad",85);
		List<Student> list = Arrays.asList(s1, s2, s3, s4);
		List l = list.stream().map(x -> x.getName().compareTo(x.getName())).collect(Collectors.toList());
		//list.sort(Comparator.comparing(Student::getName));

		Comparator<Student> byName = Comparator.comparing(Student::getName).thenComparing(Student::getAge).reversed();
		//Comparator<Student> byAge = Comparator.comparing(Student::getAge);
		
		Collections.sort(list, byName);
		list.forEach(System.out::println);
		/*
		 * Supplier<String> name = student::getName; Supplier<String>
		 * name2=name.get()::toUpperCase; System.out.println(name2.get());
		 */

	}
}
