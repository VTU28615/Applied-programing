class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> lis1 = preOrder(p);
        List<Integer> lis2 = preOrder(q);
        int n = lis1.size();
        int m = lis2.size();
        if (m != n)
            return false;
        for (int i = 0; i < n; i++)
            if (!Objects.equals(lis1.get(i), lis2.get(i)))
                return false;
        return true;
    }

    public List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    public void preOrder(TreeNode root, List<Integer> res) {
        if (root == null){
            res.add(null);
            return;
        }
        res.add(root.val);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }
}
