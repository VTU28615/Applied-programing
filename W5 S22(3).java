class Solution {
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrderTraversalHelper(root, res);
        return res;
    }

    public void postOrderTraversalHelper(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        postOrderTraversalHelper(root.left, list);
        postOrderTraversalHelper(root.right, list);
        list.add(root.val);
    }
}
