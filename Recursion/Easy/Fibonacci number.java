// Question => https://practice.geeksforgeeks.org/problems/fibonacci-using-recursion/1/?track=DSASP-Recursion&batchId=154
class Solution
{
    static int fibonacci(int n)
    {
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
