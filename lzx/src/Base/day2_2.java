package Base;
import java.util.Scanner;
//��ĳ�Ա������ �붨��һ����ͨ����(Vehicle)���ધ������: ���Ԫ��ٶ�(speed)
//�����(size)�ȵ� �������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),
//����speedDown()�ȵ�. ����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ������������ʼ��speed,size��ֵ��
//����ͨ����ӡ���������⪧���ü��٪����ٵķ������ٶȽ��иı䡣������Thead.sleep()��������ʵ����ʱ�����Լ���api����
public class day2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		System.out.println("�����������ĳ��ٶ���size");
		System.out.println("���ٶȣ�");
		@SuppressWarnings("resource")
		Scanner i=new Scanner(System.in);
		float s1=i.nextFloat();
		System.out.println("size��");
		float s2=i.nextFloat();
		 Vehicle v =new Vehicle(s1,s2);
		 v.move();
		 v.setSpeed(s1);
		 System.out.println("1-����  2-���٣��� 1�� 2��");
		 int next=i.nextInt();
		 if(next==1) {System.out.println("���������ֵ��");float add=i.nextFloat();v.speedUp(add);}
		 if(next==2) {System.out.println("���������ֵ��");float red=i.nextFloat();v.speedUp(red);}
	}
	
}
class Vehicle {
		 float speed;//�ٶ�
		 float size;//��С
		
		public Vehicle(float speed, float size) {
	        this.speed = speed;
	        this.size = size;
	    }
		public void move(){//����
			System.out.println("�����Ѿ�����");
			System.out.println("���ٶ�Ϊ��"+speed+"m/s  ��СΪ��"+size);
		}
		public void setSpeed(float speed)
		{
			this.speed = speed;
			}
		public void speedUp(float speed) throws InterruptedException
		{
			System.out.println("������..");
			this.speed=this.speed+speed;
			Thread.sleep(300);
			System.out.println("���ٳɹ�,�˿��ٶ�Ϊ��"+this.speed+"m/s  ");
		}
		public void speedDown(float speed) throws InterruptedException
		{
			System.out.println("������..");
			this.speed=this.speed-speed;
			Thread.sleep(300);
			System.out.println("���ٳɹ����˿��ٶ�Ϊ��"+this.speed+"m/s ��");
			}
		}
