package src.test.java.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import src.main.java.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void checkCaseContains3() {
		Assert.assertEquals("Fizz", FizzBuzz.check(13));
	}

	@Test
	public void checkCaseContains5() {
		Assert.assertEquals("Buzz", FizzBuzz.check(52));
	}

	@Test
	public void checkCaseContains3And5() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.check(53));
	}

	@Test
	public void checkCaseDividedBy3() {
		Assert.assertEquals("Fizz", FizzBuzz.check(9));
	}

	@Test
	public void checkCaseDividedBy5() {
		Assert.assertEquals("Buzz", FizzBuzz.check(10));
	}

	@Test
	public void checkCaseDividedBy3And5() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.check(15));
	}

	@Test
	public void checkCaseReturnNumber() {
		Assert.assertEquals("1", FizzBuzz.check(1));
	}

}
