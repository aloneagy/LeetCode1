package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-13 23:55
 * @description:this is the class for
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 **/

public class mirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return root;
        TreeNode tem=root.left;
        root.left=root.right;
        root.right=tem;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
