package Base;
//16.题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？   
public class practice_4_6__16 {
	public static void main(String[] args) {
		int a=0; 
		while(true)
		{
			double x=Math.sqrt(a+100);
			double y=Math.sqrt(a+168);
			if((x-(int)x)==0&&(y-(int)y)==0){
				System.out.println(a);
				break;
			}
			a++;
		}
}
}
