package com.exatip.product.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String input = "ilovejavatechie";
		String[] result = input.split("");
		System.out.println(Arrays.toString(result));

		List<String> list = Arrays.stream(result).distinct().collect(Collectors.toList()); //
		System.out.println(list);
	}

}
