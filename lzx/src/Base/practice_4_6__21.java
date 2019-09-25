package Base;
//21.题目：求1+2!+3!+...+20!的和   
public class practice_4_6__21 {
	public static void main(String[] args) {
		long sum=0;
		long sum1=1;
		for(int i=1;i<=20;i++)
		{
			sum1=1;
			for(int j=1;j<=i;j++)
				
			{
				sum1=sum1*j;
			}
			System.out.print(i+"!");
			if(i!=20) {System.out.print("+");}
			sum=sum+sum1;
		}
		System.out.println("="+sum);
	}
}
