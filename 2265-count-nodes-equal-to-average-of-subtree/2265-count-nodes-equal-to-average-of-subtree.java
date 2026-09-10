/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Global variable to keep track of the final answer
    private int matchingNodesCount = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return matchingNodesCount;
    }

    /**
     * Helper method that performs a Post-Order traversal.
     * @return int[] where index 0 is the sum of values, and index 1 is the count of nodes.
     */
    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0}; // Base case: {sum = 0, count = 0}
        }

        // 1. Post-order: Process left and right children first
        int[] leftData = dfs(node.left);
        int[] rightData = dfs(node.right);

        // 2. Accumulate values for the current node's subtree
        int totalSum = leftData[0] + rightData[0] + node.val;
        int totalCount = leftData[1] + rightData[1] + 1;

        // 3. Check condition (Java integer division automatically rounds down)
        if (totalSum / totalCount == node.val) {
            matchingNodesCount++;
        }

        // 4. Return current subtree metadata to the parent call
        return new int[]{totalSum, totalCount};
    }
}
