// Input:                                                       
// N = 4                                        
// A[] = {1, 4, 3}
// Output:
// 2     
// Explanation:
// Vaibhav placed 4 integers but he picked
// up only 3 numbers. So missing number
// will be 2 as it will become 1,2,3,4.






class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        int num=0;
      for(int i=1;i<=N;i++){
          int count=0;
          for(int j=0;j<A.length;j++){
              
             if(A[j]!=i){
                 count++;
                 
             }            
          }
           if(count==A.length){
                 num=i;
                 break;                
             }
      } 
      return num;
    }
}