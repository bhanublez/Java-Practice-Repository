package Day33;
import java.security.DigestException;
import java.util.*;

public class binarySearchtree <T extends Comparable<T>>{
    private class Node{
        T data;
        Node left;
        Node right;
        public Node(T data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
        // public String toString(Node node){
        //     return 
        // }
    }
    private int nodeCount=0;
    private Node root=null;

    public int size(){
        return nodeCount;
    }
    public boolean isEmpty(){
        return nodeCount==0;
    }

    public boolean contains(T element){
        return contains(root,element);
    }

    private boolean contains(Node node,T element){
        if(node==null) return false;
        int cmp=element.compareTo(node.data);
        if(cmp<0){
          return contains(node.left, element) ;
        }else if(cmp>0){
            return contains(node.right,element);
        }else{
            return true;
        }
    }

    public boolean add(T element){
        if(contains(element)){
            return false;
        }else{
            root=add(root,element);
            nodeCount++;
            return true;
        }
    }

    private Node add(Node node,T element){
        if(node==null){
            node=new Node(element,null,null);
        }else{
            int cmp=element.compareTo(node.data);
            if(cmp<0){
                node.left=add(node.left,element);
            }else{
                node.right=add(node.right,element);
            }
        }

        return node;
    }

    public boolean remove(T element){
        if(contains(element)){
            root=remove(root,element);
            nodeCount--;
            return true;
        }
        return false;
    }

    private Node remove(Node node,T element){
        if(node==null) return null;
        int cmp=element.compareTo(node.data);
        if(cmp<0){
            node.left=remove(node.left,element);
        }else if(cmp>0){
            node.right=remove(node.right, element);
        }else{
            if(node.left==null){
                Node rightChild=node.right;
                node.data=null;
                return rightChild;
            }else if(node.right==null){
                Node leftChild=node.left;
                node.data=null;
                return leftChild;
            }else{
                Node tmp = findMin(node.right);
                node.data = tmp.data;
                node.right = remove(node.right, tmp.data);
            }
        }
        return node;
    }
    private Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
      }
    public static void main(String[] args) {
        //Write code
        
        

    }


}
