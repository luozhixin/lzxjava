package Base;
//ʹ����������˼��������Ϸ�еĹ���
//����������
//ĳ��˾Ҫ��������Ϸ��������������˼����ƹ����࣬�趨���԰������������֡�����ֵ���������������������������������ķ����������ķ���
//Ҫ��1��ͨ�����캯��ʵ�����Ը�ֵ
//2��������������������״̬�����ݰ����������֣�����ֵ��������
//3����������ͨ������������չ���������Ҫ�жϣ����������С�ڷ��������˺�ֵ=0����֮�˺�ֵ=������-�����������˺�ֵ�������ʾ��ͬ�ķ�����Ϣ�����ݰ����������֣��������������������ֵ
//4����д���Է�����ͨ�����캯��ʵ����������Ķ��󣬲�������ط���������������Ϣ�Զ���
import java.util.Scanner;

public class day2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monster m=new monster(200,"����",220);
		m.print();
		System.out.println("==================");
		while(true) {
			System.out.println("�����빥����");
			@SuppressWarnings("resource")
			Scanner i=new Scanner(System.in);
			int g=i.nextInt();
			if(g>m.Defensivepower) {
				g=g-m.Defensivepower;
				System.out.println(m.getName()+"��"+m.Defensivepower+"�ķ���������ʧ�ܣ�");
				m.sub(g);
				System.out.println("��ǰ����ֵ�ǣ�"+m.getLifevalue());
				
			}else {
				System.out.println(m.getName()+"��"+m.Defensivepower+"�ķ����������ɹ���");
				System.out.println("��ǰ����ֵ�ǣ�"+m.getLifevalue());
			}
		}
		
	}

}
class monster{
	private int Lifevalue;
	private String name;
	private int Aggressivity;
	int Defensivepower=20;
	public monster(int l,String n,int a) {
		this.setLifevalue(l);
		this.setName(n);
		this.setAggressivity(a);
		
	}
	public void print() {//��ӡ
		System.out.println("����"+this.name+"չ������");
		System.out.println("��ǰ����ֵ�ǣ�"+this.Lifevalue);
		System.out.println("��������"+this.Aggressivity);
		
	}
	public void sub(int l) {
		this.Lifevalue-=l;
		
	}
	
	public int getLifevalue() {
		return Lifevalue;
	}
	public void setLifevalue(int lifevalue) {
		Lifevalue = lifevalue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAggressivity() {
		return Aggressivity;
	}
	public void setAggressivity(int aggressivity) {
		Aggressivity = aggressivity;
	}


}
