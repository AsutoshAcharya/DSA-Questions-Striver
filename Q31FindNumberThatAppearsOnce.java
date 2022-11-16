// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4

class Solution {
    public int singleNumber(int[] nums) {
        int returnValue=0;
        for(int i=0;i<nums.length;i++){
            int currentElement=nums[i];
            int counter=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==currentElement){
                    counter++;
                }
            }
            if(counter==1){
                returnValue=currentElement;
                break;
            }
        }
        return returnValue;
    }
}