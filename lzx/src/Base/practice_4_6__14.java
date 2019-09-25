package Base;
//14.题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在   第10次落地时，共经过多少米？第10次反弹多高？ 
public class practice_4_6__14 {
	public static void main(String args[])
	{
		float a=100;
		float sum=0;
		System.out.println("1000以内的完数有：");
		for( int j=0;j<10;j++)
		{
			a=a/2;
			sum=sum+a;
		}
		System.out.println("第10次落地时共经过"+sum+"米");
		System.out.println("第10次反弹"+a+"米");
	}
}
