
public class Main {
	public static void main(String[] args) {

		int[] cases = {121, -121, 10};
		
		Ispalidrome obj1 = new Ispalidrome();
		
		for (int i=0; i < cases.length; i++) {
			
			boolean result = obj1.isPalidrome(cases[i]);
			System.out.println(result);
			
		}
		
	}
}
