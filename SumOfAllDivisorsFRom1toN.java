class Solution{
    static long sumOfDivisors(int N){
        long sum=0;
        for(long i=1;i<=N;i++)
        {
            long temp=i;
            for(long j=1;j<=temp;j++)
            {
                if(temp%j==0)
                {
                    sum=sum+j;
                }
                
            }
        }
        return sum;
    }
}
