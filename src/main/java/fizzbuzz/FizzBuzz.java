package src.main.java.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {
	public static void main(String[] args) {
		fizzbuzzStage1();
		fizzbuzzStage2();
	}

	public static void fizzbuzzStage1() {
		IntStream.rangeClosed(1, 100)
				.mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
				.forEach(System.out::println);
	}

	public static void fizzbuzzStage2() {

	}

	public void check(int i) {

	}

}