class BinarySearchTree {

    // Inner class representing a node in the tree
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // The root of the BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Public method to insert a key, calls the recursive helper
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive helper function to insert a new key in the BST */
    private Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Public method for inorder traversal
    void inorderTraversal() {
        inorderRec(root);
        System.out.println(); // For a new line after printing
    }

    // Recursive helper for inorder traversal (Left -> Root -> Right)
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    
    // Public method for preorder traversal
    void preorderTraversal() {
        preorderRec(root);
        System.out.println();
    }

    // Recursive helper for preorder traversal (Root -> Left -> Right)
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    
    // Public method for postorder traversal
    void postorderTraversal() {
        postorderRec(root);
        System.out.println();
    }
    
    // Recursive helper for postorder traversal (Left -> Right -> Root)
    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Main method to test the BST implementation
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let's create the following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print the traversals of the BST
        System.out.print("Inorder traversal (sorted order): ");
        tree.inorderTraversal(); // Output: 20 30 40 50 60 70 80

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(); // Output: 50 30 20 40 70 60 80

        System.out.print("Postorder traversal: ");
        tree.postorderTraversal(); // Output: 20 40 30 60 80 70 50
    }
}