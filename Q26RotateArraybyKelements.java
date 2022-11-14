public class Q26RotateArraybyKelements {
    
        public void rotate(int[] nums, int k) {
            
          
               while(k!=0){
               int temp=nums[nums.length-1];
                for(int i=nums.length-1;i>=0;i--){
                
               
                    if((i-1)>=0){
                    nums[i]=nums[i-1];
                }else{
                    nums[i]=temp;
                }
                   
               
                }
               --k;
           }
           
        }
    
}
