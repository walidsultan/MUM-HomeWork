package lesson11.lecture.generics;
import java.util.*;
public class BoundedTypeVariable {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);ints.add(4);ints.add(-1);
		System.out.println(max0(ints));
		
		List<String> strs = new ArrayList<>();
		strs.add("Bob"); strs.add("Steve"); strs.add("Tom");
		System.out.println(max2(ints));
		System.out.println(max2(strs));

	}
	
	public static Integer max0(List<Integer> list) {
		Integer max = list.get(0);
		for(Integer i : list) {
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	
	public static <T> T max1(List<? extends Comparable<T>> list) {
		Comparable<T> max = list.get(0);
//		for(T i : list) {  //compiler error
//			if(i.compareTo(max) > 0) {
//				max = i;
//			}
//		}
//		return max;
		return null;
	}
	
	public static <T extends Comparable<T>> T max2(List<T> list) {
		T max = list.get(0);
		for(T i : list) {  //compiler error
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	
	
	public static <T> T max3(List<T> list, Comparator<T> cmp) {
		T theMax = list.get(0);
		for(T item : list) {
			if(cmp.compare(item, theMax) > 0) {
				theMax = item;
			}	
		}
		return theMax;
	}
	
	public static <T> T max4(List<? extends T> list, Comparator<T> cmp) {
		T theMax = list.get(0);
		for(T item : list) {
			if(cmp.compare(item, theMax) > 0) {
				theMax = item;
			}	
		}
		return theMax;
	}
	
	
	public static <T> T max5(List<? extends T> list, Comparator<? super T> cmp) {
		T theMax = list.get(0);
		for(T item : list) {
			if(cmp.compare(item, theMax) > 0) {
				theMax = item;
			}	
		}
		return theMax;
	}
	
	static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
			
		}
		
	}

}
