class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

public class DebugTreeVisualizer {
    public static void main(String[] args) {
        // Create nodes
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        // Set a breakpoint on the line below to visualize the tree
        System.out.println("Debug Here"); // <-- Set breakpoint here
    }
}
