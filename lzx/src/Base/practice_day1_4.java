package Base;
//通过编写程序，ia = 100; ib = 50;求出ia++ - --ia + ++ib - ib-- + ++ia的值是多少。并把求出的值打印出来 
public class practice_day1_4 {
public static void main(String args[])
{
	int ia=100,ib=50;
	System.out.println("ia++---ia+++ib-ib--+++ia="+(ia++ - --ia + ++ib - ib-- + ++ia));	
	}
}
