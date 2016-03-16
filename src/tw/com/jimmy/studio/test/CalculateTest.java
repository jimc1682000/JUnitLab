package tw.com.jimmy.studio.test;

import static org.junit.Assert.*;
import org.junit.*;
import tw.com.jimmy.studio.lab.Calculator;

;

public class CalculateTest {
	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@After
	public void tearDown() {
		calculator = null;
	}

	@Test
	public void testPlus() {
		int expected = 5;
		int result = calculator.plus(3, 2);
		assertEquals(expected, result);
	}

	@Test
	public void testMinus() {
		int expected = 1;
		int result = calculator.minus(3, 2);
		assertEquals(expected, result);
	}
}
