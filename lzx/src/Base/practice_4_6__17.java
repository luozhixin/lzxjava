package Base;
//17. 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
public class practice_4_6__17 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int  k;
		double sum=0;
		System.out.print("前20项之和：");
		for(int i=0;i<20;i++)
		{
			k=a;
			a=a+b;
			b=k;
			sum=sum+a/b;
			System.out.print(a+"/"+b);
			if(i<19)
			{			
				System.out.print("+");
			}
		}
		System.out.print("="+sum);
}
}
