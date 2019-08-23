
package com.practice;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		Set s = properties.entrySet();
		Iterator<?> iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
