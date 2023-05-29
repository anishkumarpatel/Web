package com.student;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);

		for (Character c : map.keySet())
			System.out.print(c + " ");
System.out.println();
		System.out.println((double)89/3);
	}
}
