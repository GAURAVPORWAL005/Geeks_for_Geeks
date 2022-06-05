// Quesiton => https://practice.geeksforgeeks.org/problems/count-total-digits-in-a-number/1/?track=DSASP-Recursion&batchId=154
class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        int count = 0;
        if(n > 0){
        count++;
            countDigits(n/10);
        }
          
else{
            return count; 
}    
    }        
    
    
}
