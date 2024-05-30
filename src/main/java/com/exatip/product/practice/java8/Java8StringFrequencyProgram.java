package com.exatip.product.practice.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8StringFrequencyProgram {

	public static void main(String[] args) {

		String input = "ilovejavatechie";

		String[] result = input.split("");
//		System.out.println(Arrays.toString(result));

//		Map<String, List<String>> map = Arrays.stream(result).collect(Collectors.groupingBy(s -> s));
//		System.out.println(map);// getting o/p: {a=[a, a], c=[c], t=[t], e=[e, e, e], v=[v, v], h=[h], i=[i, i], j=[j], l=[l], o=[o]}

		Map<String, Long> map = Arrays.stream(result)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // groupingBy() work same
																								// as group by clause of
																								// SQL
		System.out.println(map); // o/p : {a=2, c=1, t=1, e=3, v=2, h=1, i=2, j=1, l=1, o=1}

	}

}
