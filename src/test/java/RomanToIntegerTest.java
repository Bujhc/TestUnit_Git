import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntegerTest {

	@Test
	public void test() {
		RomanToInteger obj1 = new RomanToInteger();
		
		String[] s = {"III", "LVIII", "MCMXCIV"};
		
        int[] expected = {3,58, 1994 };
		
		for (int i=0; i < s.length; i++) {
			
			int result = obj1.Calculate(s[i]);
			
			assertEquals(expected[i],result);
		}
	}

}
