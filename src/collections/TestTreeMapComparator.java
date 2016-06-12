package collections;

import java.util.*;

public class TestTreeMapComparator {
	public static void main(String[] args) {
		Comparator<String> comparator = new Comparator<String>() {
			public int compare(String obj1, String obj2) {
				if (obj1 == null) {
					return -1;
				}
				if (obj2 == null) {
					return 1;
				}
				if (obj1.length() > obj2.length()) {
					return 1;
				}
				if (obj1.length() < obj2.length()) {
					return -1;
				}
				if (obj1.equals(obj2)) {
					return 0;
				}
				return obj1.compareTo(obj2);
			}
		};
		TreeMap<String, String> treeMap1 = new TreeMap<String, String>(comparator);// or
		treeMap1.put("one", "один");
		treeMap1.put("five", "пять");
		treeMap1.put("two", "два");
		treeMap1.put("four", "четыре");
		treeMap1.put("three", "три");

		System.out.println("Map1:");
		for (Map.Entry<String, String> map : treeMap1.entrySet()) {
			String key = map.getKey();
			String value = map.getValue();
			System.out.println(key + " " + value);
		}
		System.out.println("Compare one,three:" + comparator.compare("one", "three"));

		TreeMap<Integer, String> treeMap2 = new TreeMap<Integer, String>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});
		treeMap2.put(1, "one");
		treeMap2.put(3, "three");
		treeMap2.put(4, "four");
		treeMap2.put(2, "two");
		treeMap2.put(1, "?");

		System.out.println("Map2:");
		for (Map.Entry<Integer, String> map2 : treeMap2.entrySet()) {
			int key = map2.getKey();
			String value = map2.getValue();
			System.out.println(key + " " + value);
		}
	}
}
