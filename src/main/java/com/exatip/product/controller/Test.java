package com.exatip.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rohan", "Rohit", "Rahul", "Abhishek");
		List<String> filteredList = names.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());

		System.out.println(filteredList);

	}

}
