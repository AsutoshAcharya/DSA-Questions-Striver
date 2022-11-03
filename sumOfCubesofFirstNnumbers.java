class Solution {
    long sumOfSeries(long N) {
    if(N==1)
    {
        return 1;
    }
    long smallProblem=sumOfSeries(N-1);
    long biggerProblem=(N*N*N)+smallProblem;
    return biggerProblem;
        
    }
}public class sumOfCubesofFirstNnumbers {
    
}
