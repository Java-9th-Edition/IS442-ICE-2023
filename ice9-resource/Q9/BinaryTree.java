
public class BinaryTree {

    public static void main(String[] args) {
        Height height = new Height();

        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        System.out.println(isBalanced(root, height));
    }
    public static boolean isBalanced(TreeNode root, Height height) {
        // check if root is null
        if (root == null) {
           height.height = 0;
           return true;
        }

        Height leftHeightObj = new Height();
        Height rightHeightObj = new Height();

        boolean left = isBalanced(root.getLeft(), leftHeightObj);
        boolean right = isBalanced(root.getRight(), rightHeightObj);

        int leftHeight = leftHeightObj.height;
        int rightHeight = rightHeightObj.height;

        height.height = (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;

        if (Math.abs(leftHeight - rightHeight) >= 2) {
            return false;
        } else {
            return left && right;
        }
    }
}
