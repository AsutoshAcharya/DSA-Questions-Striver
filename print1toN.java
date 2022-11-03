class Solution
{
    
  public void printNos(int N)
    {
        //base case
        if(N==0)
        {
            return;
        }
        
        //Tail   recursion
        printNos(N-1);
        
        System.out.print(N+" ");
    }
}
 
