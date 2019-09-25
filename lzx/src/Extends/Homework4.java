package Extends;
import java.util.Scanner;

public class Homework4 {//������
	static MotoVehicle m;
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		RentCar();
		Spend();
	}
	public static void RentCar() {
	 
	 
	 System.out.println("��ѡ����Ҫ�⳵�����ͣ� 1�γ� 2����");
	 int a=input.nextInt();
	 if(a==1) {
		 System.out.println("�������������γ����ͺţ�d.���ڣ�b.����b1.���ۣ�y.Ӣ����ϣ���");
		 String type=input.next();
		 System.out.println("�������������γ��ĳ��ƣ�");
		 int no=input.nextInt();
		 m=new Car(no, type);
	 }
	 if(a==2) {
		 System.out.println("��������������������������10,20,30,40����");
		 int seatCount=input.nextInt();
		 System.out.println("�����������������ĳ��ƣ�");
		 int no=input.nextInt();
		 m=new Bus(no, seatCount);
	 }
 }
	public static void Spend() {
		System.out.println("���������⳵��������");
		int day=input.nextInt();
		System.out.println("���⳵"+day+"�칲�軨��"+m.CalcRent(day)+"Ԫ");
	}
}
class Car extends MotoVehicle {
	String Type;
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	public Car(int no,String type) {
		// TODO Auto-generated constructor stub
		setNo(no);
		this.Type=type;
		switch (type) {
		case "b1":
			setRent(100);
			break;
		case "b":
			setRent(200);break;
		case "d":
			setRent(50);break;
		case "y":
			setRent(300);break;
		
		}
	}
	@Override
	public double CalcRent(int day) {
		if(day<=10) {
			return day*Rent;
			}else {
				double sum=0;
				for(int i=0;i<day-10;i++) {
					sum=sum+Rent*1.1;
				}
				return 10*Rent+sum;
			}
		// TODO Auto-generated method stub
		
	}
}
class Bus extends MotoVehicle {
	int SeatCount;
	public int getSeatCount() {
		return SeatCount;
	}
	public void setSeatCount(int seatCount) {
		SeatCount = seatCount;
	}
	public Bus(int no,int seatCount) {
		this.SeatCount=seatCount;
		setNo(no);
		switch (seatCount) {
		case 10:
			setRent(100);
			break;
		case 20:
			setRent(200);break;
		case 30:
			setRent(300);break;
		case 40:
			setRent(400);break;
		
		}
			
		// TODO Auto-generated constructor stub
	}
	@Override
	public double CalcRent(int day) {
		if(day<=10) {
		return day*Rent;
		}else {
			double sum=0;
			for(int i=0;i<day-10;i++) {
				sum=sum+Rent*1.1;
			}
			return 10*Rent+sum;
		}
		// TODO Auto-generated method stub
		
	}
}
abstract class MotoVehicle{
	int No;//���ƺ�
	String Brannd;//Ʒ��
	String Color;
	float Mileage;//���
	int Rent;
	public int getRent() {
		return Rent;
	}
	public void setRent(int rent) {
		Rent = rent;
	}
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getBrannd() {
		return Brannd;
	}
	public void setBrannd(String brannd) {
		Brannd = brannd;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public float getMileage() {
		return Mileage;
	}
	public void setMileage(float mileage) {
		Mileage = mileage;
	}
	public abstract double CalcRent(int day);
	}

