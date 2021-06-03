package src.test.java.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import src.main.java.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void checkCaseContains3() {
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("Fizz", fb.check(13));
	}

	@Test
	public void checkCaseContains5() {
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("Buzz", fb.check(52));
	}

	@Test
	public void checkCaseContains3And5() {
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("FizzBuzz", fb.check(53));
	}

	@Test
	public void checkCaseDividedBy3() {
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("Fizz", fb.check(9));
	}

	@Test
	public void checkCaseDividedBy5() {
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("Buzz", fb.check(10));
	}

	@Test
	public void checkCaseDividedBy3And5() {
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("FizzBuzz", fb.check(15));
	}

	@Test
	public void checkCaseReturnNumber() {

	}

}
