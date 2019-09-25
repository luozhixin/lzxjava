package Base;
//13.一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程   找出1000以内的所有完数。   
public class practice_4_6__13 {
	public static void main(String args[])
	{
		System.out.println("1000以内的完数有：");
		for( int j=1;j<=1000;j++)
		{
			int sum=0;
		for(int i=1;i<j;i++)
		{
			if(j%i==0)
			{
				sum=sum+i;		
			}
		}
		if(sum==j) {System.out.println(j);}
		}
	}
}