package tree;

class BSTNode {
    int val;
    BSTNode left;
    BSTNode right;
    
    BSTNode(int val) {
        this.val = val;
    }
}

public class BinarySearchTree {
    private BSTNode root;
    
    public void insert(int val) {
        root = insertRec(root, val);
    }
    
    private BSTNode insertRec(BSTNode root, int val) {
        if (root == null) {
            return new BSTNode(val);
        }
        
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        
        return root;
    }
    
    public boolean search(int val) {
        return searchRec(root, val);
    }
    
    private boolean searchRec(BSTNode root, int val) {
        if (root == null || root.val == val) {
            return root != null;
        }
        
        if (val < root.val) {
            return searchRec(root.left, val);
        }
        
        return searchRec(root.right, val);
    }
    
    public void inorder() {
        System.out.print("Inorder Traversal: ");
        inorderRec(root);
        System.out.println();
    }
    
    private void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        // Insert some values
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
        // Print the tree in sorted order
        bst.inorder();
        
        // Test search
        System.out.println("Search for 40: " + bst.search(40));
        System.out.println("Search for 90: " + bst.search(90));
    }
}