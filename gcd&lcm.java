
class Solution {
    static long gcd(Long A,Long B){
        if (B==0)
        return A;
        
        return (gcd(B,A%B));
    }
    
    static Long[] lcmAndGcd(Long A , Long B){
        Long [] arr = new Long[2];
         
         arr[0]= (A*B)/gcd(A,B);
        
        
        
        arr[1]= gcd(A,B);
        return arr;
    }
};
