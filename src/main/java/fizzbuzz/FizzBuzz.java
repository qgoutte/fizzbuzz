package src.main.java.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {
	public static void main(String[] args) {
		fizzbuzzStage1();
		System.out.println("");
		fizzbuzzStage2();
	}

	public static void fizzbuzzStage1() {
		System.out.println("---STAGE 1---");
		IntStream.rangeClosed(1, 100)
				.mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
				.forEach(System.out::println);
		System.out.println("---END STAGE 1---");
	}

	public static void fizzbuzzStage2() {
		System.out.println("---STAGE 2---");
		for (int i = 1; i < 101; i++) {
			System.out.println(check(i));
		}
		System.out.println("---END STAGE 2---");
	}

	public static String check(int i) {
		String result = "";
		String iString = String.valueOf(i);
		if (i % 3 == 0 || iString.contains("3")) {
			result = result + "Fizz";
		}
		if (i % 5 == 0 || iString.contains("5")) {
			result = result + "Buzz";
		}
		if (!(i % 3 == 0 || iString.contains("3")) && !(i % 5 == 0 || iString.contains("5"))) {
			return iString;
		}
		return result;
	}

}