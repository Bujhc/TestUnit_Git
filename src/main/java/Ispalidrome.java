
public class Ispalidrome {
	
	public boolean isPalidrome(int x) {
	
		if (x < 0) {
            return false;
        }

        int currentNumber = x;
        int reversNumber = 0;

        while (x != 0) {
            int extractNumber = x % 10;

            reversNumber = reversNumber * 10 + extractNumber;
            x /=10;
        }

        return currentNumber == reversNumber;
    }
		
/* example of bad solution 
			String stringNumber = "" + x;
			String middle = "";
			int checkNumber = 0;
			
			if (x > 0)  {

				for (int i= (stringNumber.length()-1); i >= 0; i--) {
					middle = middle + stringNumber.charAt(i);
				}
				checkNumber = Integer.valueOf(middle);
				
				if (checkNumber == x) {
					return true;
				}
			}
		return false;
	}
		
 */
}
