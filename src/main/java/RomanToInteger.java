
import java.util.HashMap;


public class RomanToInteger {

		String cases;
		
		HashMap<String, Integer> setRoman = new HashMap<>(); 
		
		public RomanToInteger() {
			setRoman.put("I", 1);
			setRoman.put("V", 5);
			setRoman.put("X", 10);
			setRoman.put("L", 50);
			setRoman.put("C", 100);
			setRoman.put("D", 500);
			setRoman.put("M", 1000);
			setRoman.put("IV", 4);
			setRoman.put("IX", 9);
			setRoman.put("XL", 40);
			setRoman.put("XC", 90);
			setRoman.put("CD", 400);
			setRoman.put("CM", 900);
		}
		
		public int Calculate (String s) {
			
			int result = 0;
			int x = 0;
			while ( x < s.length()) {
				if ( (x+1) < s.length()) {
		            String twoSymbol = s.substring(x, x+2);
		            if (setRoman.containsKey(twoSymbol) == true) {
		                result +=setRoman.get(twoSymbol);
		                x += 2;
		                continue;
		            } 
		        }

		        String oneSymbol = s.substring(x, x+1);
		        result +=setRoman.get(oneSymbol);
		        x ++;
			}
			return result;
		}
		
}
