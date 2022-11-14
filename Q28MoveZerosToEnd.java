public class Q28MoveZerosToEnd {

        public void moveZeroes(int[] nums) {
           //base case
           int n = nums.length;
           if(n<2) return;
   
           //pointers
   
           int l = 0,r = 1;
           while(r<n){
               if(nums[l]!=0){
                   l++;
                   r++;
               }else if(nums[r] == 0){
                   r++;
               }else{
                   int temp = nums[r];
                   nums[r] = nums[l];
                   nums[l] = temp;
               }
           }
       }
   
}
