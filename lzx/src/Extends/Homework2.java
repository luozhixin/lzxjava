package Extends;

public class Homework2 {//������
	static Vehicle v;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		v=new SelfCar("��С��", "����", 1242);
		v.begin();
		v.stop();
		v=new Taxi("�ϳ���⳵��˾", "����", 124);
		v.begin();
		v.stop();
		
	}

}
abstract class Vehicle{
	private String type;
	private int no;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public abstract void stop() ;
	public abstract void begin() ;
}
class SelfCar extends Vehicle {
	private String username;
	public SelfCar(String username,String type,int no) {
		setNo(no);
		setType(type);
		setUsername(username);
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void stop() {
	System.out.println(getUsername()+"��"+getType()+"ֹͣ��");
		
	}

	@Override
	public void begin() {
		// TODO Auto-generated method stub
		System.out.println(getUsername()+"��"+getType()+"������");
	}
}
class Taxi extends Vehicle{
	private String company;
	public Taxi(String company,String type,int no) {
		setCompany(company);
		setNo(no);
		setType(type);
	// TODO Auto-generated constructor stub
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(getCompany()+"��"+getType()+"ֹͣ��");
	}

	@Override
	public void begin() {
		// TODO Auto-generated method stub
		System.out.println(getCompany()+"��"+getType()+"������");
	}
}