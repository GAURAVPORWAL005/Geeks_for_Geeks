// Question => https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/?track=DSASP-Recursion&batchId=154

class Solution
{
    
  public void printNos(int N)
    {
        if(N==0){
            return ;
        }
        printNos(N-1);
        System.out.print(N + " ");
    }
}
