package Extends;
import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in); 
		Pc p;
		System.out.print("��ѡ����Ҫ����Ļ�����1.̨ʽ�� 2.�ʼǱ� 3.PDA����");
		int a=input.nextInt();
		if(a==1) {
			p=new Dc("N1", "i7 7700k", "����", "21Ӣ��", "atx����");
			p.ds();
		}
		if(a==2) {
			p=new Nc("N2", "i7 7700k", "����", "15Ӣ��", "2000mAh���﮵��");
			p.ds();
		}
		if(a==3) {
			p=new PDA("N3", "i7 7700k", "����", "10Ӣ��", "2000mAh���﮵��","TFT����ʽ��Ļ");
			p.ds();
		}

	}

}
abstract class Pc{
	private String name;
	private String cpu;
	private String brand;
	private String monitor;
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}
public String getCpu() {
		return cpu;
	}
public void setCpu(String cpu) {
		this.cpu = cpu;
	}
public String getBrand() {
		return brand;
	}
public void setBrand(String brand) {
		this.brand = brand;
	}
public String getMonitor() {
		return monitor;
	}
public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
public abstract void ds();
	
}

class Dc extends Pc{
	private String box;
	
	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}
	
	public Dc(String name,String cpu,String brand,String monitor,String box) {
		setBox(box);
		setBrand(brand);
		setCpu(cpu);
		setMonitor(monitor);
		setName(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ds() {
		// TODO Auto-generated method stub
		System.out.println("��ϸ�嵥��̨ʽ����");
		System.out.println("���ƣ�"+getName());
		System.out.println("Ʒ�ƣ�"+getBrand());
		System.out.println("���������ͣ�"+getCpu());
		System.out.println("��ʾ����"+getMonitor());
		System.out.println("�������ͣ�"+getBox());
		
		
	}

}
class Nc extends Pc{
	private String battery;
	
	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}
	public Nc(String name,String cpu,String brand,String monitor,String battery) {
		setBattery(battery);
		setBrand(brand);
		setCpu(cpu);
		setMonitor(monitor);
		setName(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ds() {
		// TODO Auto-generated method stub
		System.out.println("��ϸ�嵥���ʼǱ���");
		System.out.println("���ƣ�"+getName());
		System.out.println("Ʒ�ƣ�"+getBrand());
		System.out.println("���������ͣ�"+getCpu());
		System.out.println("��ʾ����"+getMonitor());
		System.out.println("������ͣ�"+getBattery());
	}

}
class PDA extends Pc{
	private String battery;
	private String TouchScreen;
	
	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getTouchScreen() {
		return TouchScreen;
	}

	public void setTouchScreen(String touchScreen) {
		TouchScreen = touchScreen;
	}

	public PDA(String name,String cpu,String brand,String monitor,String battery,String touchScreen) {
		setTouchScreen(touchScreen);
		setBattery(battery);
		setBrand(brand);
		setCpu(cpu);
		setMonitor(monitor);
		setName(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ds() {
		// TODO Auto-generated method stub
		System.out.println("��ϸ�嵥���ʼǱ���");
		System.out.println("���ƣ�"+getName());
		System.out.println("Ʒ�ƣ�"+getBrand());
		System.out.println("���������ͣ�"+getCpu());
		System.out.println("��ʾ����"+getMonitor());
		System.out.println("������ͣ�"+getBattery());
		System.out.println("���������ͣ�"+getTouchScreen());
	}

}






