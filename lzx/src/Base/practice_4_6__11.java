package Base;
import java.util.Scanner;
//��������������m��n���������Լ������С�������� 
public class practice_4_6__11 {
	private static Scanner s;

	public static void main(String args[])
	{
		System.out.println("������m��");
		s = new Scanner(System.in);
		int m=s.nextInt();
		System.out.println("������n��");
		int n=s.nextInt();
		int a;
		int c=2;
		int d;
		if(m>n) {a=n;d=m;}else {a=m;d=n;}
        for(int b=a;b>=0;b--)
	    		{
	    			if(m%b==0&&n%b==0)
	    			{
	    				System.out.println("m��n����С��Լ��Ϊ"+b);
	    				break;
	    			}
	    		}
        while(true) {
        	if((a*c)%d==0) {System.out.println("m��n����С������Ϊ"+(a*c));break;}
        	c++;
        }	
        }
}
