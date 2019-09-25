package Base;
import java.util.Scanner;
public class Homework6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int num=input.nextInt();
		float sum=0;
		for(int i=1;i<=num;i++){
			System.out.println("请输入java课中第"+i+"个学生的成绩:");
			int grade=input.nextInt();
			if(grade>=80){
				sum++;
			}
		}
		System.out.println("分数大于等于 80分的学生比例为："+(sum/num)+"%");
	}

}
