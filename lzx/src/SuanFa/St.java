package SuanFa;

import java.util.Arrays;

public class St {
	public static void main(String[] args) {
		String str=new  String("  We      Are Happy.    ");
		System.out.println("1判断是否为空，返回true/false："+str.isEmpty());		
		System.out.println("2判断是否存在索引值，返回返回true/false："+str.contains("W"));
		System.out.println("3获取字符串指定字符在字符串中的位置，默认从0开始查找："+str.indexOf("W"));
		System.out.println("4获取字符串指定位置处的索引值，此处显示："+str.charAt(0)+"与"+str.charAt(1));
		System.out.println("5获取字符串指定字符在字符串中的位置,9代表从位置9开始索引，如不存在返回-1："+str.indexOf("W", 9));
		System.out.println("6获取字符串指定字符在字符串中最后出现的位置："+str.lastIndexOf("p"));
		System.out.println("7获取字符串的长度："+str.length());
		System.out.println("8将一个或多个空格替换成%20："+str.replaceAll(" +","%20"));
		System.out.println("9将字符串变为小写："+str.toLowerCase());
		System.out.println("10将字符串变为大写："+str.toUpperCase());
		System.out.println("11将字符串以空格为节点分割为一个数组："+Arrays.toString(str.split(" +")));
		System.out.println("12去除字符串两端空格："+str.trim());	
	}
}	
