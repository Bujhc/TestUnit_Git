import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumUnit2 {

	@Test
	public void test() {
		Twosum obj1 = new Twosum();
		
		int[] example = {0,2,3,4,8,4};
		int targetNum = 5;
		
		int[] outputF = obj1.twoSum(example, targetNum);
		
		// Test the output
		
		int[] expected = {1,2};
		
		assertArrayEquals(expected,outputF);
	
	}

}
