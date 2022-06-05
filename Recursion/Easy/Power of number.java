// Question => https://practice.geeksforgeeks.org/problems/power-using-recursion/1/?track=DSASP-Recursion&batchId=154
class Solution
{
    static int RecursivePower(int n,int p)
    {
        if(p == 0){
            return 1;
        }
                return n *RecursivePower(n,p-1);

    }
 
}
