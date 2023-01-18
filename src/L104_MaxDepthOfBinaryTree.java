import utils.TreeNode;

public class L104_MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(maxDepth(treeNode.left), maxDepth(treeNode.right)) + 1;
    }
}
