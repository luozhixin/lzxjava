package Base;
import java.util.Scanner;
public class practice_4_6__1 {
private static Scanner a;
//1.题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。   
public static void main(String args[]) {
	while(true) {
	System.out.println("请输入成绩：");
	a = new Scanner(System.in);
	int x=a.nextInt();
	if(x>=90)
	{
		System.out.println("成绩等级为A");
	}
	if(x<=59)
	{
		System.out.println("成绩等级为C");
	}
	if(x>=60&&x<=89)
	{
		System.out.println("成绩等级为B");
	}
	}
}
}
