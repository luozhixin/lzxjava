package ListType;
//循环录入一个有10个学生的班级成绩，求出班级里面的平均分、最高分、最低分。以及求出班级中成绩高于80分的人数并输出。


import java.util.Scanner;

public class Test2 {
	public static void main(String[] args ) {
		int [] arr1=new int [10];
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int max,min,sum=0,sum1=0;
		for (int i=0;i<=9;i++) {
			System.out.println("请输入第"+(i+1)+"个学生的成绩：");
			arr1[i]=input.nextInt();
			sum=sum+arr1[i];
			if(arr1[i]>80) {
				sum1++;
			}
			
		}
		max=arr1[0];
		min=max;
		for (int i=1;i<=9;i++) {
			if(arr1[i]>max) {
				max=arr1[i];
			}	
			if(arr1[i]<min) {
				min=arr1[i];
			}	
			
		}
		
		System.out.println("最高分："+max);
		System.out.println("最低分："+min);
		System.out.println("平均分："+(sum/10));
		System.out.println("高于80的人数："+sum1);

	}

}
