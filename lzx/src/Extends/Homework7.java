package Extends;
import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in); 
		Job j;
		System.out.print("��ѡ����Ҫѡ��Ĺ�����1.���� 2.���룩��");
		int a=input.nextInt();
		if(a==1) {
			j=new Test(10, 2, "������Ŀ�Ѿ�ʵ�ֵĹ���", "ѹ������");
			j.describe();
		}
		if(a==2) {
			j=new Code(10, 2, "ʵ����Ŀδʵ�ֵĹ���", "����ʵ��");
			j.describe();
		}
		

	}

}
abstract class Job{
	private String name;
	private String type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void describe();
	
}
class Test extends Job{
	private int BugNum;
	private int TNum;
	public Test(int bugNum,int tNum,String name,String type) {
		setName(name);
		setType(type);
		setBugNum(bugNum);
		setTNum(tNum);
		
	
		// TODO Auto-generated constructor stub
	}

	public int getBugNum() {
		return BugNum;
	}

	public void setBugNum(int bugNum) {
		BugNum = bugNum;
	}

	public int getTNum() {
		return TNum;
	}

	public void setTNum(int tNum) {
		TNum = tNum;
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println("�������ƣ�"+getName());
		System.out.println("�������ͣ�"+getType());
		System.out.println("��������������"+getTNum());
		System.out.println("���ֵ�bug������"+getBugNum());
		
	}
	

}
class Code extends Job{
	private int BugNum;
	private int CNum;
	public Code(int bugNum,int cNum,String name,String type) {
		setName(name);
		setType(type);
		setBugNum(bugNum);
		setCNum(cNum);
		// TODO Auto-generated constructor stub
	}
	public int getBugNum() {
		return BugNum;
	}

	public void setBugNum(int bugNum) {
		BugNum = bugNum;
	}

	public int getCNum() {
		return CNum;
	}

	public void setCNum(int cNum) {
		CNum = cNum;
	}

	

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println("�������ƣ�"+getName());
		System.out.println("�������ͣ�"+getType());
		System.out.println("��Ч����������"+getCNum());
		System.out.println("û�н����bug������"+getBugNum());
	}
	

}