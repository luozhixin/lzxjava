package Base;
//8.题目：判断101-200之间有多少个素数，并输出所有素数。   
public class practice_4_6__8 {
public static void main(String args[])
{
	int y=0;
	System.out.println("101到200的素数有：");
	for(int i=101;i<=200;i++)
	{
		int x=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				x=x+1;
			}
		}
		if(x==0)
		{
			System.out.println(i);
			y=y+1;
		}
	}
	System.out.println("总共"+y+"个");
	}
}
