package SuanFa;

import javax.print.attribute.standard.NumberOfDocuments;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/10 14:24
 * @Description:
 */
public class solution {

    //��n��2������ʽ�����ұ߿�ʼ�ж��ǲ���1
    /*
     * �ýⷨ�������ʱ������������ѭ����
     * ��Ϊ��������ʱ�������λ������1
     * ����������Ŀ������1�ĸ�������ô����������
     * 1�ˡ�
     */
    //-------------����������ѭ���Ľⷨ---------------------
    public static int NumberOf1_CanNotUse(int n) {
        int count = 0;
        while (n != 0) {
            /*
             * ��1��n����λ�����㣬
             * ���Ҫ��Ϊ1��n��2������ʽ
             * ���ұ���λ�϶���1������Ϊ0
             */
            if ((n & 1) == 1) {
                count++;
            }
            //��n��2������ʽ������һλ
            n = n >> 1;
        }
        return count;
    }
    //---------------����--------------------------------
    //˼�룺��1��1�����������㣬��ʵ�����Ͳ���1�ˣ���n��ÿλ����λ�룬���ж�1�ĸ���
    private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
    //--------------------���Ž�----------------------------
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            System.out.println("******"+(n-1)+"####"+n);
            n = (n - 1) & n;
            System.out.println(n);
        }
        return count;
    }
    public static void main(String[] args) {
        //ʹ��n=10,��������ʽΪ1010����1�ĸ���Ϊ2��
        int n = 5;
        System.out.println(n + "�Ķ�������1�ĸ�����" + NumberOf1(n));
    }
}