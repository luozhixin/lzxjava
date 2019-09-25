package Base;
import java.util.Scanner;
//折扣计算
public class Homework4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=input.next();
		double sum=0;
		int grade;
		for(int i=1;i<=5;i++){
			System.out.println("请输入5门功课中第"+i+"门课的成绩:");
		    grade=input.nextInt();
			if(grade<0){
				i--;
				System.out.println("成绩输入有误");
				continue;
			}
			sum=sum+grade;
		}
		System.out.println(name+"的平均分是:"+(sum/5));
	}

}
