package Extends;
import java.util.Scanner;

public class Homework4 {//测试类
	static MotoVehicle m;
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		RentCar();
		Spend();
	}
	public static void RentCar() {
	 
	 
	 System.out.println("请选择您要租车的类型： 1轿车 2卡车");
	 int a=input.nextInt();
	 if(a==1) {
		 System.out.println("请输入您心怡轿车的型号（d.大众，b.宝马，b1.奔驰，y.英菲尼迪）：");
		 String type=input.next();
		 System.out.println("请输入您心怡轿车的车牌：");
		 int no=input.nextInt();
		 m=new Car(no, type);
	 }
	 if(a==2) {
		 System.out.println("请输入您心怡卡车的载重量（10,20,30,40）：");
		 int seatCount=input.nextInt();
		 System.out.println("请输入您心怡卡车的车牌：");
		 int no=input.nextInt();
		 m=new Bus(no, seatCount);
	 }
 }
	public static void Spend() {
		System.out.println("请输入您租车的天数：");
		int day=input.nextInt();
		System.out.println("您租车"+day+"天共需花费"+m.CalcRent(day)+"元");
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
	int No;//车牌号
	String Brannd;//品牌
	String Color;
	float Mileage;//里程
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

