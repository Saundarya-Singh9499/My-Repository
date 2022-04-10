package BinaryTrees1;

import java.util.Scanner;

import javax.accessibility.AccessibleState;

public class NodesGreaterThanX {

public static BinaryTreeNode<Integer> takeInput(boolean isRoot , int parentData , boolean isLeft){
    	
        if(isRoot) {
        	
        	System.out.println("Enter the Root Data");
        }
     
        else if(isLeft) {
        	
        	System.out.println("Enter the Left Child of " + parentData);
        }
   
        else {
        	
        	System.out.println("Enter the Right Child of " + parentData);
        }
    
      Scanner sc = new Scanner(System.in);
      
      int rootData = sc.nextInt();
      
      if( rootData == -1 ) {
    	  
    	  return null;
      }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);
        
        BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);
        
        root.left = leftChild;
        
        root.right = rightChild;
        
        return root;
  }
	
    public static int  nodesGreater( BinaryTreeNode<Integer> root , int X ) {
    	
    	if( root == null ) {
    		
    		return 0;
    	}
    
        int count = 0;   
    	
        if( root.data > X ) {
        	   
        	  count+= 1;
           }
    	
    	  int leftNode = nodesGreater(root.left , X);
          int rightNode = nodesGreater(root.right , X);
    
         return count + leftNode + rightNode;  
    }

	public static void main(String[] args) {
		
    BinaryTreeNode<Integer> root = takeInput(true , 0 , true);
    
    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();
    
    int result = nodesGreater(root, X);
    
    System.out.println(result);
	 
    }

}
