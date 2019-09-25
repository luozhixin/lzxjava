package SuanFa;

import java.util.Scanner;
public class SelectNsum1 {
	public static void main(String[] args) {
		long count=0;//用来记录“1”的个数
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字n：");
		long n=input.nextLong();//接收数字n
		for(long i=1;i<=n;i++) {//for循环遍历1到n
			String s=String.valueOf(i);//将整型数字i转换为字符串
			for(int j=0;j<s.length();j++) {//获取字符串的长度，循环遍历
				char s2=s.charAt(j);//获取当前位置的索引
				if(s2=='1') {//判断是否为“1”，为 1，count+1
					count=count+1;
				}
			}			
		}
		System.out.println("1到"+n+"有"+count+"个1！");//循环结束打印结果	
		input.close();
	}	
}
