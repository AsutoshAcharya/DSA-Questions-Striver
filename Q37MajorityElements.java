// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

class Q37majorityElements {
    public int majorityElement(int[] nums) {
        int maxCountIndexValue=0;
        int maxCount=0;
        
        Set<Integer> hash_Set = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            int count=0;                         
            if(!hash_Set.contains(nums[i]))
            {
                for(int j=0;j<nums.length;j++){                
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            }
            if(count>maxCount){
                maxCount=count;
                maxCountIndexValue=nums[i];
            }
            hash_Set.add(nums[i]);
        }
        return maxCountIndexValue;
    }
}