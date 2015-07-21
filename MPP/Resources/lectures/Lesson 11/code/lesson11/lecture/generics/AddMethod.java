package lesson11.lecture.generics;

import java.util.*;

public class AddMethod {
	public static void count(Collection<? super Integer> ints, int n) {
		for(int i = 0; i < n; ++i) {
			ints.add(i);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> ints1 = new ArrayList<>();
		count(ints1, 5);
		System.out.println(ints1); //output: [0,1,2,3,4]
		
		List<Number> ints2 = new ArrayList<>();
		count(ints2, 5);
		ints2.add(5.0);
		System.out.println(ints2); //output: [0,1,2,3,4, 5.0]
		
		List<Object> ints3 = new ArrayList<>();
		count(ints3, 5);
		ints3.add("five");
		System.out.println(ints3); //output: [0,1,2,3,4, five]
		
		List<?> testList = new ArrayList<Object>();
		List<Object> test2 = new ArrayList<Object>();
		testList = test2;
		
	}
}
