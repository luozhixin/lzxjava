package Base;
import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		String name=input.next();
		double sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("������5�Ź����е�"+i+"�ſεĳɼ�:");
			int grade=input.nextInt();
			sum=sum+grade;
		}
		System.out.println(name+"��ƽ������:"+(sum/5));
	}

}
