// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]


public class Q36SortArraysOf0s1sand2s {
    
        public void sortColors(int[] nums) {
                int count0=0;
                int count1=0;
                int count2=0;
            for(int i=0;i<nums.length;i++){
                
                if(nums[i]==0){
                    count0++;
                }
                if(nums[i]==1){
                    count1++;
                }
                if(nums[i]==2){
                    count2++;
                }
            }
            for(int i=0;i<count0;i++){
                nums[i]=0;
            }
            for(int i=count0;i<count0+count1;i++){
                nums[i]=1;
            }
            for(int i=count0+count1;i<count0+count1+count2;i++){
                nums[i]=2;
            }
        }
    
}
