package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceBinary {

	public static void main(String[] args) {
		
		//BinaryOperator<Integer> sum;//function interface binary operator
		Integer identity=0;// to start the accumulation process the input is been given i.e identity
		Stream<Integer> stream=Stream.of(10,3,1);
		int res=stream.reduce(identity, (i1,i2)->i1+i2);
		System.out.println(res);
		
		final List<Integer> numbers=Arrays.asList(20,30,40);
		int sum1=numbers.stream().reduce(0,(num1, num2)->(num1+num2));
		System.out.println("sum is:"+sum1);

	}

}
