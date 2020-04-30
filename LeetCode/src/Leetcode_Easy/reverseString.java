package Leetcode_Easy;

/**
 * @author ynz
 * create at 2020-04-28 16:06
 * @description:this is the class for
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 **/

public class reverseString {
    public void reverseString(char[] s) {
        char tem;
        for(int i=0;i<s.length/2;i++){
            tem=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=tem;
        }
    }
}
