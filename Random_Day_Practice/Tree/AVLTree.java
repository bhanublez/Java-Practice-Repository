package Random_Day_Practice.Tree;

import java.util.Iterator;

public class AVLTree<T extends Comparable<T>> implements Iterable<T> {
    public class Node {
        Node left, right;
        T data;
        int bf;
        int height;

        public Node(T data) {
            this.data = data;
        }
    }
    
    private Node root;
    private int countNode = 0;

    public int size() {
        return countNode;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }

    public int height() {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public boolean contains(T value) {
        Node node = root;
        while (node != null) {
            int cmp = value.compareTo(node.data);
            if (cmp > 0) {
                node = node.right;
            } else if (cmp < 0) {
                node = node.left;
            } else {
                return true;
            }
        }
        return false;
    }

    private Node TOKEN = new Node(null);

    public boolean insert(T value) {
        if (value == null) {
            return false;
        }
        Node node = insert(root, value);
        boolean insertNode = (node != TOKEN);
        if (insertNode) {
            countNode++;
            root = node;
        }
        return insertNode;
    }
    
    public Node insert(Node node, T value) {
        if (node == null) {
            return new Node(value);
        }
        int cmp = value.compareTo(node.data);
        if (cmp < 0) {
            Node nodeLeft = insert(node.left, value);
            if (nodeLeft == TOKEN)
                return TOKEN;
            node.left = nodeLeft;
        } else if (cmp > 0) {
            Node nodeRight = insert(node.right, value);
            if (nodeRight == TOKEN) {
                return TOKEN;
            }
            node.right = nodeRight;
        } else {
            return TOKEN;
        }

        update(node);
        return balance(node);
    }
    
    public void update(Node node) {
        int leftNodeHeight = -1;
        if (node.left != null) {
            leftNodeHeight = node.left.height;
        }
        int rightNodeHeigth = -1;
        if (node.right != null) {
            rightNodeHeigth = node.right.height;
        }
        node.height = 1 + Math.max(leftNodeHeight, rightNodeHeigth);
        node.bf = rightNodeHeigth - leftNodeHeight;
    }


    public Node balance(Node node) {
        if (node.bf == -2) {
            if(node.left.bf<=)
        }
    }


}

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
