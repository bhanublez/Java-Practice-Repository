package Random_Day_Practice.Tree;

public class BST <T extends Comparable<T>>{
    private int nodeCount=0;
    private Node root=null;

    private class Node {
        T data;
        Node left, right;

        public Node(Node left, Node right, T data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int size() {
            return nodeCount;
        }

        public boolean isEmpty() {
            return size() == 0;
        }
    }
    
    //Insertion element in the tree
    public boolean add(T element) {
        if (contains(element)) {
            return false;
        } else {
            root = add(root, element);
            nodeCount++;
            return true;
        }
    }

    public Node add(Node node, T element) {
        if (node == null) {
            node = new Node(null, null, element);
        } else {
            if (element.compareTo(node.data) < 0) {
                node.left = add(node.left, element);
            } else {
                node.right = add(node.right, element);
            }
        }
        return node;
    }
    
    public boolean contains(T element) {
        return contains(root, element);
    }

    private boolean contains(Node node, T element) {
        if (node == null)
            return false;
        int cmp = element.compareTo(node.data);
        if (cmp < 0) {
            return contains(node.left, element);
        } else if (cmp > 0) {
            return contains(node.right, element);
        } else {
            return true;
        }
    }
    
    public boolean remove(T element) {
        if (contains(element)) {
            root = remove(root, element);
            nodeCount--;
            return true;
        }
        return false;
    }

    public Node remove(Node node, T element) {
        if (node == null)
            return null;
        int cmp = element.compareTo(node.data);
        if (cmp < 0) {
            node.left = remove(node.right, element);
        } else if (cmp > 0) {
            node.right = remove(node.right, element);
        } else {
            if (node.left == null) {
                Node rightChild = node.right;
                node.data = null;
                node = null;
                return rightChild;
            } else if (node.right == null) {
                Node leftChild = node.left;
                node.data = null;
                node = null;
                return leftChild;
            } else {
                Node temp = digLeft(node.right);
                node.data = temp.data;
                node.right = remove(node.right, temp.data);
            }
        }
            return node;
    }
    
    private Node digLeft(Node node) {
        Node curr = node;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    private Node digRight(Node node) {
        Node curr = node;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr;
    }

    public T digLeft() {
        if (root == null) {
            return null;
        }
        return digLeft(root).data;
    }

    public T digRight() {
        if (root == null) {
            return null;
        }
        return digRight(root).data;
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    // Traversing of BST
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(" " + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(" " + node.data);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(" " + node.data);
        inOrder(node.right);
    } 

}
