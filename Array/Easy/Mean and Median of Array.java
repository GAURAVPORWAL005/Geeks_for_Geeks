// Question => https://practice.geeksforgeeks.org/problems/mean-and-median-1587115620/0/?track=DSASP-Arrays&batchId=154#

class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
     
       Arrays.sort(A);
       
       if(A.length % 2 != 0){
           return (A[A.length/2]);
           
       }
       else{
           return (A[A.length/2] + A[A.length/2-1]) /2;
       }
     
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
        int sum = 0;
       for(int i=0;i<N;i++){
           sum += A[i];
       }
       return sum/A.length;
    }

}
