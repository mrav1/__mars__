public class ArrayToTree {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left=this.right = null;
        }
        Node(int data, Node left, Node right){
            this.right = right;
            this.left = left;
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root = array2tree(new int[]{1,2,3,4,5,6}, 0);
        System.out.println(root);
    }

    private static Node array2tree(int[] ints, int i) {
        if(i>=ints.length){
            return null;
        }

      return new Node(ints[i], array2tree(ints, 2*i+1), array2tree(ints, 2*i+2));
    }
}
