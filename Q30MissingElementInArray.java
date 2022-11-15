// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8
// Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

public class Q30MissingElementInArray {
    
        public int missingNumber(int[] nums) {
            int missingValue=0;
            for(int i=0;i<=nums.length;i++){
                int temp=0;
              for(int j=0;j<nums.length;j++){
                  if(nums[j]==i){
                      
                      temp++;
                      break;
                  }
                  
              }
                if(temp==0){
                      missingValue=i;
                  }
                
            }
            return missingValue;
        }
    
}
