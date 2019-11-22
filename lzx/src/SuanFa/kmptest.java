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
        // Ŀ���ַ����±�
        int i = 0;
        // �������±�
        int j = 0;
        // ��������һλ�Ĳ���ƥ���
        int[] next = getNext(pattern);

        while (i < target.length && j < pattern.length) {
            // j == -1 ��ʾ���������ʼ����ƥ��
            if (j == -1 || target[i] == pattern[j]) {
                i++;
                j++;
                // ƥ��ʧ��ʱ����ѯ������ƥ������õ�������λ��j��ǰ�����ͬǰ��׺����
                // ��j�ƶ������ͬǰ��׺���ȵĺ�һλ��Ȼ���ټ�������ƥ��
            } else {
                j = next[j];
            }
        }

        // ������ÿһλ����ƥ��ɹ�������ƥ��ĵ���ʼλ��
        if (j == pattern.length)
            return i - j;
        else
            return -1;
    }

    public static int[] getNext(char[] pattern) {
        char[] p = pattern;
        int[] next = new int[p.length];
        // ��һλ��Ϊ-1�������жϵ�ǰλ���Ƿ�Ϊ�����ʵ��ʼ
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
