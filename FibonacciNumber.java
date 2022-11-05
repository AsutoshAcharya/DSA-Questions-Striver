// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
// Given n, calculate F(n).


// Example 3:

// Input: n = 4
// Output: 3
// Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

class FibonacciNumber {
    public int fib(int n) {
        //base case
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        //recursive function
        // F(n) = F(n - 1) + F(n - 2), for n > 1.
        return fib(n-1)+fib(n-2);
    }
}