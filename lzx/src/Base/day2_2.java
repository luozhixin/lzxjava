package Base;
import java.util.Scanner;
//类的成员变量 请定义一个交通工具(Vehicle)的类其中有: 属性速度(speed)
//体积(size)等等 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),
//减速speedDown()等等. 最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值
//并且通过打印出来。另外调用加速减速的方法对速度进行改变。（其中Thead.sleep()方法可以实现延时具体自己查api）。
public class day2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		System.out.println("请输入汽车的初速度与size");
		System.out.println("初速度：");
		@SuppressWarnings("resource")
		Scanner i=new Scanner(System.in);
		float s1=i.nextFloat();
		System.out.println("size：");
		float s2=i.nextFloat();
		 Vehicle v =new Vehicle(s1,s2);
		 v.move();
		 v.setSpeed(s1);
		 System.out.println("1-加速  2-减速（填 1或 2）");
		 int next=i.nextInt();
		 if(next==1) {System.out.println("请输入加速值：");float add=i.nextFloat();v.speedUp(add);}
		 if(next==2) {System.out.println("请输入减速值：");float red=i.nextFloat();v.speedUp(red);}
	}
	
}
class Vehicle {
		 float speed;//速度
		 float size;//大小
		
		public Vehicle(float speed, float size) {
	        this.speed = speed;
	        this.size = size;
	    }
		public void move(){//启动
			System.out.println("汽车已经启动");
			System.out.println("初速度为："+speed+"m/s  大小为："+size);
		}
		public void setSpeed(float speed)
		{
			this.speed = speed;
			}
		public void speedUp(float speed) throws InterruptedException
		{
			System.out.println("加速中..");
			this.speed=this.speed+speed;
			Thread.sleep(300);
			System.out.println("加速成功,此刻速度为："+this.speed+"m/s  ");
		}
		public void speedDown(float speed) throws InterruptedException
		{
			System.out.println("减速中..");
			this.speed=this.speed-speed;
			Thread.sleep(300);
			System.out.println("减速成功，此刻速度为："+this.speed+"m/s ：");
			}
		}
