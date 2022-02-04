public class LowestCommonAnscestor {
    /*
          1

     2        3

  4     5    6   7

     */

    public static void main(String[] args) {
        LowestCommonAnscestor solution = new LowestCommonAnscestor();
        solution.solve();
    }


    public void solve() {

        // Build tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.right.left.right = new TreeNode(9);
        root.right.right.right = new TreeNode(8);

        TreeNode res = lowestCommonAncestor(root, 9, 8);
        System.out.println(res.data);
    }

    // Normal binary tree
    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null || root.data == p || root.data == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null && right == null) return null; // not present in left & right
        if(left != null && right != null) return root; // both left & right has one key
        return left == null ? right : left;
    }

    // binary search tree
    private TreeNode findLCASearchTree(TreeNode n, int a, int b) {
        if (n == null) return null;
        if(a < n.data && b < n.data) return findLCASearchTree(n.left, a, b);
        else if (a > n.data && b > n.data) return findLCASearchTree(n.right, a, b);
        else return n;
    }

}
