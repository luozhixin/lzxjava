package Base;
import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=input.next();
		double sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("请输入5门功课中第"+i+"门课的成绩:");
			int grade=input.nextInt();
			sum=sum+grade;
		}
		System.out.println(name+"的平均分是:"+(sum/5));
	}

}
