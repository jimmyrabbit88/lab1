package BinaryTree;
/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/

public class BinarySearchTree<E extends Comparable<E>> {

   private Node root;

   private class Node {
      public E data;
      public Node left;
      public Node right;
   }

   public BinarySearchTree() {
      root = null;
   }

   public void insert(E e) {
      Node newNode = new Node();
      newNode.data = e;
      newNode.left = null;
      newNode.right = null;
      if (root == null)
         root = newNode;
      else
         insertSub(root, newNode);
   }

   private void insertSub(Node node, Node newNode) {
      int result = node.data.compareTo(newNode.data);
      if (result >= 0) {
         //go left
         if (node.left == null) {
            node.left = newNode;
         } else {
            insertSub(node.left, newNode);
         }
      } else {
         //go right
         if (node.right == null) {
            node.right = newNode;
         } else {
            insertSub(node.right, newNode);
         }
      }
   }

   public boolean contains(E e) {
       if(root == null){
           return false;
       }
       else{
           return containsSub(root, e);
       }
   }

   private boolean containsSub(Node node, E e){
       int res = node.data.compareTo(e);
       if(res == 0){
           return true;
       }
       else{
           if( res > 0){
               if(node.left == null){
                   return false;
               }
               else{
                   return containsSub(node.left, e);
               }
           }
           else{
               if(node.right == null){
                   return false;
               }
               else{
                   return containsSub(node.right, e);
               }
           }
       }
   }

   public boolean containsIter(E e){
       Node temp = root;
       while(temp != null){
           int res = temp.data.compareTo(e);
           if(res == 0){
               return true;
           }
           else{
               if (res > 0){
                   temp = temp.left;
               }
               else{
                   temp = temp.right;
               }
           }
       }
       return false;

   }

    public void insertIter(E e){
        Node newNode = new Node();
        newNode.data = e;
        newNode.left = null;
        newNode.right = null;
        Node temp = root;
        while(temp != null){
            int res = temp.data.compareTo(e);
            if (res > 0){
                temp = temp.left;
            }
            else{
                temp = temp.right;
            }
        }


    }

}