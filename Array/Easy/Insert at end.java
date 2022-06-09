//Question => https://practice.geeksforgeeks.org/problems/array-insert-at-end/0/?track=DSASP-Arrays&batchId=154#
class Insert
{
    // You only need to insert the given element at 
    // the end, i.e., at index sizeOfArray - 1. You may 
    // assume that the array already has sizeOfArray - 1
    // elements. 
    public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        arr[sizeOfArray-1] = element;
        // for(int i=0;i<sizeOfArray;i++){
        //     // System.out.print(arr[i] + "");
        // }
    }
}

// Time complexity => O(1)
