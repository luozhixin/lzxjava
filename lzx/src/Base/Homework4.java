package Base;
import java.util.Scanner;
//�ۿۼ���
public class Homework4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		String name=input.next();
		double sum=0;
		int grade;
		for(int i=1;i<=5;i++){
			System.out.println("������5�Ź����е�"+i+"�ſεĳɼ�:");
		    grade=input.nextInt();
			if(grade<0){
				i--;
				System.out.println("�ɼ���������");
				continue;
			}
			sum=sum+grade;
		}
		System.out.println(name+"��ƽ������:"+(sum/5));
	}

}
