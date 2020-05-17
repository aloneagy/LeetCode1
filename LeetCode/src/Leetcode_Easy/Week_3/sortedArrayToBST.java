package Leetcode_Easy.Week_3;

/**
 * @author ynz
 * create at 2020-05-12 17:42
 * @description:this is the class for
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 *
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *           0
 *          / \
 *        -3   9
 *        /   /
 *      -10  5
 **/

public class sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length);
    }
    public TreeNode buildTree(int[] nums,int left,int right){
        if(left==right) return null;
        int mid=(left+right)/2;
        TreeNode nod=new TreeNode(nums[mid]);
        nod.left=buildTree(nums,left,mid);
        nod.right=buildTree(nums,mid+1,right);
        return nod;
    }
}
