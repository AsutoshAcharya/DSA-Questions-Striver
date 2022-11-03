class Solution {

    void printGfg(int N) {
        
        //Base Case
        if(N==0)
        {
            return;
        }
        System.out.print("GFG ");
        printGfg(N-1);
    }
}