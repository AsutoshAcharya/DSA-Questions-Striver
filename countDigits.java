import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
       int temp=N,rem,count=0;
       while(N!=0)
       {
            rem=N%10;
           if(rem!=0)
           {
               if(temp%rem==0){
                   count++;
               }
              
           }
           N=N/10;
       }
       return count;
    }
}