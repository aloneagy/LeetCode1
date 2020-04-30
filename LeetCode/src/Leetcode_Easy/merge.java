package Leetcode_Easy;

import java.util.Arrays;

/**
 * @author ynz
 * create at 2020-04-30 16:12
 * @description:this is the class for
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 *
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 *
 * 示例:
 *
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 **/

public class merge {
    public void merge(int[] A, int m, int[] B, int n) {
        int len=Math.abs(A.length-B.length);
        for (int i = 0; i <len; i++) {
            A[B.length+i]=B[i];
        }
        Arrays.sort(A);
    }
}
