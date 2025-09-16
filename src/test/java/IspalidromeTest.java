import static org.junit.Assert.*;

import org.junit.Test;

public class IspalidromeTest {

	@Test
	public void test() {
		Ispalidrome obj1 = new Ispalidrome();
		
        int[] cases = {121, -121, 10, 8998, 1234567899};
		
        boolean[] expected = {true,false,false, true, false };
		
		for (int i=0; i < cases.length; i++) {
			
			boolean result = obj1.isPalidrome(cases[i]);
			
			assertEquals(expected[i],result);
			
		}
		
		
		
	}

}
