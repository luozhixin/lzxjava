package OOP;

import java.util.Scanner;

public class Homework0422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��һ����");
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		MyMath mymath=new MyMath();
		System.out.print("�����ֵ�����������ݣ�");
		int a=input.nextInt();
		System.out.println(a+"�ľ���ֵΪ      "+mymath.abs(a));
		System.out.println();
		System.out.println("��x��y�η������������ݣ�");
		System.out.print("x��");
		int x=input.nextInt();
		System.out.print("y��");
		int y=input.nextInt();
		System.out.println(x+"��"+y+"�η�Ϊ     "+mymath.pow(x,y));
		System.out.println();
		System.out.print("����������ֵ�����������ݣ�");
		float a1=input.nextFloat();
		System.out.println(a1+"����������ֵΪ    "+mymath.round(a1));
		System.out.println();
		System.out.println();
		System.out.println("2.����һ����Demo,���ж���һ�����������ݺ͵ķ���������һ��������Test�����в���");
		DemoTest demotest=new DemoTest();
		demotest.test();
		System.out.println();
		System.out.println();
		System.out.println("3.����һ����������,���� ���ܳ�������ķ�����Ȼ����һ��������Test2�����в��ԡ�");
		RectangleTest re=new RectangleTest();
		re.test2();
		System.out.println();
		System.out.println();
		System.out.println("4.����һ��Ա����,�Լ�������������Ա��Ȼ�������Ա���������췽���� getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�");
		Staff staff=new Staff(18,"��С��","��","manager");
		staff.print();
		//5.����һ����MyMath1,�ṩ�����ļӼ��˳����ܣ�Ȼ����в��ԡ�
		//6.����һ��Բ����Բ���ܳ������
	}

}
class MyMath{
	//��һ�⣺1.�༭һ��MyMath�࣬��Ҫ��:ȫ��ʹ���Լ��༭�Ĵ��벻�ܵ���ϵͳ�е�Math���е��κη�����
	
	
	int abs(int a) {//ʵ�ַ���int abs(int a);���ݲ���a���ؽ����a�ľ���ֵ��
		if(a<0) {
			a=0-a;
		}
		return a;
	}
	float pow(int x,int y) {//ʵ�ַ���int pow(int x,int y); ���x��y�η��Ľ�������ء�

		float sum=1;
		int p=y;
		if(y<0) {
			y=0-y;
		}
		if(y==0) {sum=1;}else {
		for(int i=1;i<=y;i++) {
			sum*=x;
		}
		}
		if(p<0) {
			sum=1/sum;
		}
		return sum;
		
	}
	int round(float a) {//		ʵ�ַ��� int round(float a); ����a��ֵ�����������������ֵ��
		int b=(int) a;
		float c=a-b;
		if(c>0.5) {
			b++;
		}
        if(c<-0.5) {
			b--;
		}
        return b;
	}

}
class Demo{//�ڶ��⣺����һ����Demo,���ж���һ�����������ݺ͵ķ���
	int add(int x,int y){
		return x+y;
	}
}
class DemoTest{//����һ�������࣬���в��ԡ�
	Demo demo=new Demo(); 
	Scanner input =new Scanner(System.in);
	void test() {
		System.out.println("������x:");
		int x=input.nextInt();
		System.out.println("������y:");
		int y=input.nextInt();
		System.out.println("�������ݺ�:"+demo.add(x, y));
	}
}

class Rectangle{//3.����һ����������,���� ���ܳ�������ķ�����Ȼ����һ��������Test2�����в��ԡ�
	int size(int x,int y) {
		return x*y;
	}
	int perimeter(int x,int y){
		return 2*(x+y);
	}
}
class RectangleTest{//����һ�������࣬���в��ԡ�
	Rectangle demo=new Rectangle(); 
	Scanner input =new Scanner(System.in);
	void test2() {
		System.out.println("�������x:");
		int x=input.nextInt();
		System.out.println("�������y:");
		int y=input.nextInt();
		System.out.println("���������Ϊ:"+demo.size(x, y));
		System.out.println("�������ܳ�Ϊ:"+demo.perimeter(x, y));
	}
}

class Staff{//4.����һ��Ա����,�Լ�������������Ա��Ȼ�������Ա���������췽���� 
	//getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�
	int age;
	String name,sex,position;
	Staff(int age,String name,String sex,String position){
		setAge(age);
		setName(name);
		setPosition(position);
		setSex(sex);
	}
	void print() {
		System.out.println("������"+this.name);
		System.out.println("���䣺"+this.age);
		System.out.println("�Ա�"+this.sex);
		System.out.println("ְλ��"+this.position);
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
				
}

