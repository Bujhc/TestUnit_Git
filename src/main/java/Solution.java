
class Solution {
    
	public int[] twoSum(int[] nums, int target) {

       int[] result = {0,1};
         
       for (int i=0; i < (nums.length - 1); i++) {

            for (int y=i+1; y < (nums.length); y++) {
                
                if ((nums[i] + nums[y]) == target) {
                    
                    result[0] = i;
                    result[1] = y;
                    break;
                    // to fix first pair
                    // change programmme to check the start of CI/CD 2231
                
                }

            }
       }
    return result;   
    }
}