// Question => https://practice.geeksforgeeks.org/problems/array-insert-at-index/0/?track=DSASP-Arrays&batchId=154#
class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        
        for(int i=sizeOfArray-1;i>index;i--){
            arr[i] = arr[i-1];
            
        }
         arr[index] = element;
       
    }
}
// Time complexity => O(n)
