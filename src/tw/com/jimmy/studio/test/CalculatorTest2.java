package tw.com.jimmy.studio.test;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import tw.com.jimmy.studio.lab.Calculator;

@RunWith(value = Parameterized.class)
public class CalculatorTest2 {
	@Parameterized.Parameters
	public static Collection<Integer[]> getParameters() {
		return Arrays.asList(new Integer[][] { { 5, 3, 2 }, // expected, para1,
															// para2
				{ 3, 1, 2 }, // expected, para1, para2
				{ 2, 1, 1 } // expected, para1, para2
				});
	}

	private int expected;
	private int para1;
	private int para2;

	public CalculatorTest2(int expected, int para1, int para2) {
		this.expected = expected;
		this.para1 = para1;
		this.para2 = para2;
	}

	@Test
	public void testPlus() {
		Calculator calculator = new Calculator();
		int result = calculator.plus(para1, para2);
		assertEquals(expected, result);
	}
}