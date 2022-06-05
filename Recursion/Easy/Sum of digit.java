// Question => https://practice.geeksforgeeks.org/problems/sum-of-digits-of-a-number/1/?track=DSASP-Recursion&batchId=154
class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        if(n == 0){
            return 0;
        }
        return sumOfDigits(n/10) + n % 10;
    }
}

