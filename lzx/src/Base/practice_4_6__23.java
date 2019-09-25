package Base;
//23.题目：打印出如下图案（菱形）   
public class practice_4_6__23 {
	public static void main(String[] args) {
		int a=2;
		int b=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=a;j>=0;j--)
			{
				System.out.print(" ");
			}
			a--;
			for(int k=1;k<=b;k++) 
			{
				System.out.print("*");
				}
			b=b+2;
			System.out.println("");
		}
		a=0;
		b=5;
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=a;j++)
			{
				System.out.print(" ");
			}
			a++;
			for(int k=1;k<=b;k++) 
			{
				System.out.print("*");
				}
			b=b-2;
			System.out.println("");
		}
	}
}

