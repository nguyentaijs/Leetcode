import utils.TreeNode;

public class L108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructTree(nums, 0, nums.length -1);
    }

    private TreeNode constructTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) /2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = constructTree(nums, left, mid - 1);
        node.right = constructTree(nums, mid + 1, right);
        return node;
    }

    public static void main(String[] args) {
        // Write a test case here
        L108_ConvertSortedArrayToBinarySearchTree test = new L108_ConvertSortedArrayToBinarySearchTree();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = test.sortedArrayToBST(nums);
        System.out.println(root.val); // Output: 0
        System.out.println(root.left.val); // Output: -3
        System.out.println(root.right.val); // Output: 5
    }
}
