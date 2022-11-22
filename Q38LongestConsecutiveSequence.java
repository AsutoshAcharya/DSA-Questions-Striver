

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.


import java.util.Arrays;
public class Q38LongestConsecutiveSequence {
    
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
    
            Arrays.sort(nums);
    
            int longestStreak = 1;
            int currentStreak = 1;
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i-1]) {
                    if (nums[i] == nums[i-1]+1) {
                        currentStreak += 1;
                    }
                    else {
                        longestStreak = Math.max(longestStreak, currentStreak);
                        currentStreak = 1;
                    }
                }
            }
    
            return Math.max(longestStreak, currentStreak);
        }
    
}
