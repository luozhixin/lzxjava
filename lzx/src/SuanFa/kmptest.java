package SuanFa;/**
 * @Auther:zhixin.Luo
 * @Date: 2019/11/21 16:20
 * @Description:
 */

import java.util.Arrays;

/**
 * @program: lzx
 * @description:
 * @author: Zhixin.luo
 * @create: 2019-11-21 16:20
 **/
public class kmptest
{
    public static void main(String[] args) {
        System.out.println(KMP("01235fffsdfd54ff5ffsf3453041234454553242425224526","12111141"));
    }
    public static int KMP(String t, String p) {
        char[] target = t.toCharArray();
        char[] pattern = p.toCharArray();
        // 目标字符串下标
        int i = 0;
        // 搜索词下标
        int j = 0;
        // 整体右移一位的部分匹配表
        int[] next = getNext(pattern);

        while (i < target.length && j < pattern.length) {
            // j == -1 表示从搜索词最开始进行匹配
            if (j == -1 || target[i] == pattern[j]) {
                i++;
                j++;
                // 匹配失败时，查询“部分匹配表”，得到搜索词位置j以前的最大共同前后缀长度
                // 将j移动到最大共同前后缀长度的后一位，然后再继续进行匹配
            } else {
                j = next[j];
            }
        }

        // 搜索词每一位都能匹配成功，返回匹配的的起始位置
        if (j == pattern.length)
            return i - j;
        else
            return -1;
    }

    public static int[] getNext(char[] pattern) {
        char[] p = pattern;
        int[] next = new int[p.length];
        // 第一位设为-1，方便判断当前位置是否为搜索词的最开始
        next[0] = -1;
        int i = 0;
        int j = -1;

        while(i < p.length - 1) {
            if (j == -1 || p[i] == p[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        System.out.println(Arrays.toString(next));
        return next;
    }
}
