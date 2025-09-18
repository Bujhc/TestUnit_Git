
public class Main {
	public static void main(String[] args) {

		String[] s = {"III", "LVIII", "MCMXCIV"};
		
		RomanToInteger obj1 = new RomanToInteger();
		
		
		
		for (int i=0; i < s.length; i++) {
			
			int result = obj1.Calculate(s[i]);
			System.out.println(result);
			
		}
		
	}
}
