// Question => https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#
class Tree
{
    //Function to return list containing elements of left view of binary tree
    ArrayList<Integer> leftView(Node root){
            ArrayList<Integer> result = new ArrayList<>();

    leftView(root,result,0);
      return result;
    }
    public void leftView(Node curr, ArrayList<Integer> result, int currDepth){
            if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        
        leftView(curr.left, result, currDepth + 1);
        leftView(curr.right, result, currDepth + 1);
        
        
    }
}
// Time complexity => O(n)
// Space complexity => O(h)
