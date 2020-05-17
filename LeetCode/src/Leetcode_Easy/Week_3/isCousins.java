package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-14 13:45
 * @description:this is the class for
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 *
 * 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
 *
 * 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。
 *
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,3,4], x = 4, y = 3
 * 输出：false
 * 示例 2：
 *
 *
 * 输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
 * 输出：true
 * 示例 3：
 *
 *
 *
 * 输入：root = [1,2,3,null,4], x = 2, y = 3
 * 输出：false
 **/

public class isCousins {
    TreeNode father=null;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        int height = getHeight(root, x);
        TreeNode one=father;
        int height1 = getHeight(root, y);
        TreeNode two=father;
        return height==height1&&one!=two;
    }
    public int getHeight(TreeNode root,int x){
        if(root==null) return -1;
        if(root.val==x) return 0;
        int left=getHeight(root.left,x);
        int right=getHeight(root.right,x);
        if(left==0||right==0){
            father=root;
        }
        return Math.max(left,right)+1;
    }
}
