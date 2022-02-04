public class IdenticalBinaryTree {

    public boolean isMatch(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.data == q.data) {
            return isMatch(p.left, q.left) && isMatch(p.right, q.right);
        }
        return false;
    }

}
