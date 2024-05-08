import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    public TreeNode(int val) {
        this.val = val;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public static List<TreeNode> printSiblings(TreeNode root, TreeNode node) {
        List<TreeNode> siblings = new ArrayList<>();
        if (root == null || node == null || root == node) {
            return siblings;
        }
        TreeNode current = root;
        while (current!= null) {
            if (current.left == node || current.right == node) {
                if (current.left!= node) {
                    siblings.add(current.left);
                }
                if (current.right!= node) {
                    siblings.add(current.right);
                }
                return siblings;
            }
            if (current.val < node.val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return siblings;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // set parent for each node
        root.setParent(null);
        setParentRecursive(root.left, root);
        setParentRecursive(root.right, root);
        setParentRecursive(root.left.left, root.left);
        setParentRecursive(root.left.right, root.left);
        setParentRecursive(root.right.left, root.right);
        setParentRecursive(root.right.right, root.right);

        TreeNode node = root.left; // change this to the node you want to find the siblings of
        System.out.println("Siblings of " + node.val + ": ");
        List<TreeNode> siblings = printSiblings(root, node);
        for (TreeNode sibling : siblings) {
            System.out.println(sibling.val);
        }
    }

    public static void setParentRecursive(TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        }
        node.setParent(parent);
        setParentRecursive(node.left, node);
        setParentRecursive(node.right, node);
    }
}