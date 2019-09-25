package Base;
import java.util.Scanner;
//输入两个正整数m和n，求其最大公约数和最小公倍数。 
public class practice_4_6__11 {
	private static Scanner s;

	public static void main(String args[])
	{
		System.out.println("请输入m：");
		s = new Scanner(System.in);
		int m=s.nextInt();
		System.out.println("请输入n：");
		int n=s.nextInt();
		int a;
		int c=2;
		int d;
		if(m>n) {a=n;d=m;}else {a=m;d=n;}
        for(int b=a;b>=0;b--)
	    		{
	    			if(m%b==0&&n%b==0)
	    			{
	    				System.out.println("m和n的最小公约数为"+b);
	    				break;
	    			}
	    		}
        while(true) {
        	if((a*c)%d==0) {System.out.println("m和n的最小公倍数为"+(a*c));break;}
        	c++;
        }	
        }
}
