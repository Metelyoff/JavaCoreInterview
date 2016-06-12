package multithteads;

import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
	public static class WordLengthCallable implements Callable<Integer> {
		private String word;

		public WordLengthCallable(String word) {
			this.word = word;
		}

		public Integer call() {
			return Integer.valueOf(word.length());
		}
	}

	public static void main(String args[]) throws Exception {
		String[] words = { "100", "2000", "30000" };
		ExecutorService pool = Executors.newFixedThreadPool(3);
		Set<Future<Integer>> set = new HashSet<Future<Integer>>();
		for (String word : words) {
			Callable<Integer> callable = new WordLengthCallable(word);
			Future<Integer> future = pool.submit(callable);
			set.add(future);
		}
		int sum = 0;
		for (Future<Integer> future : set) {
			sum += future.get();
		}
		System.out.printf("The sum of lengths is %s%n", sum);
		// System.exit(sum);
	}
}
