package Base;
//22.题目：求100之内的素数   
public class practice_4_6__22 {
	public static void main(String[] args) {
		int sum=0;
		if(sum==0) {System.out.print("100以内的素数有:");
		for(int i=2;i<=100;i++)
		{
			sum=0;
			for(int j=2;j<=i;j++)
				
			{
				if(j<i&&i%j==0) {
					sum++;
				}
			}
			if(sum==0) {System.out.print(i+" ");}
		}
	}
}
	}