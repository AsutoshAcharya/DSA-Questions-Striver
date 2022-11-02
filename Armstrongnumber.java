class Solution {
    static String armstrongNumber(int n){
        int r=0;
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,3);
            n=n/10;
            
        }
        if(temp==sum)
        {
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
