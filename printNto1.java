class Solution
{
    
  public void printNos(int N)
    {
        //base case
        if(N==0)
        {
            return;
        }
        
        //Head recursion
        System.out.print(N+" ");
        printNos(N-1);
        
    }
}
