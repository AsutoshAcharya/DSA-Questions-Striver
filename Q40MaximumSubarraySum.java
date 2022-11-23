// Given an integer array nums, find the subarray which has the largest sum and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.


public class Q40MaximumSubarraySum {
   
        public int maxSubArray(int[] nums) {
            
            // O(n3) time complexity

   //--------------------------------------------------------------------------//         
        //     int maxSum=nums[0];
        //     for(int i=0;i<nums.length;i++){ 
        //         for(int j=0;j<nums.length;j++){                
        //             int subArraySum=0;
        //             for(int k=i;k<=j;k++){                    
        //                 subArraySum=subArraySum+nums[k];
        //             }
        //            maxSum=Math.max(maxSum,subArraySum);
        //         }
        //     }
        //     return maxSum;
        // }  
        
     //--------------------------------------------------------------------------// 
     
         // O(n) time complexity   
            int sum=0;
            int maxSum=nums[0];
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                maxSum=Math.max(sum,maxSum);
                if(sum<0){
                    sum=0;
                }
            }
            return maxSum;
        }
    
    
}
