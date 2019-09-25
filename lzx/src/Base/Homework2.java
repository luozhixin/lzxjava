package Base;
import java.util.Scanner;

public class Homework2 {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个值：");
		int num=input.nextInt();
		for(int i=0;i<=num;i++){
			System.out.println(i+"+"+(num-i)+"="+num);
			
		}
		
	}
}
