package Base;
//通过键盘输入张华的语文成绩，数学成绩。学校评选“三好学生”要求：语文成绩至少90分，数学成绩至少95分。输出张华是否能评上“三好学生”。

import java.util.Scanner;

public class practice_day1_5 {

private static Scanner a;

public static void main(String args[])
{
	System.out.println("请依次输入张华的语文成绩和数学成绩：");
	a = new Scanner(System.in);
	int ia=a.nextInt();
	int ib=a.nextInt();
	if(ia>=90&&ib>=95) {
		
		System.out.println("张华能被评为三好学生");
	}else {
	System.out.println("张华不能被评为三好学生");	
	}
	}
}
