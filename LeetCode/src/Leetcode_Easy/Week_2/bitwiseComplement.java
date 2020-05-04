package Leetcode_Easy.Week_2;

/**
 * @author ynz
 * create at 2020-05-03 19:19
 * @description:this is the class for
 * 每个非负整数 N 都有其二进制表示。例如， 5 可以被表示为二进制 "101"，11 可以用二进制 "1011" 表示，依此类推。注意，除 N = 0 外，任何二进制表示中都不含前导零。
 *
 * 二进制的反码表示是将每个 1 改为 0 且每个 0 变为 1。例如，二进制数 "101" 的二进制反码为 "010"。
 *
 * 给你一个十进制数 N，请你返回其二进制表示的反码所对应的十进制整数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：5
 * 输出：2
 * 解释：5 的二进制表示为 "101"，其二进制反码为 "010"，也就是十进制中的 2 。
 * 示例 2：
 *
 * 输入：7
 * 输出：0
 * 解释：7 的二进制表示为 "111"，其二进制反码为 "000"，也就是十进制中的 0 。
 * 示例 3：
 *
 * 输入：10
 * 输出：5
 * 解释：10 的二进制表示为 "1010"，其二进制反码为 "0101"，也就是十进制中的 5 。
 **/

public class bitwiseComplement {
    public int bitwiseComplement(int N) {
        int a=N;
        if(N==0) return 1;
        int count=0;
        while (N!=0){
            N=N>>1;
            count++;
        }
        return ((int)Math.pow(2,count)-1-a);
    }

    public static void main(String[] args) {
        bitwiseComplement a=new bitwiseComplement();
        int i = a.bitwiseComplement(5);
        System.out.println(i);
    }
}
