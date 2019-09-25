package OOP;

//编写一个类，能够实现时间的自动增加，其中应有三个整型成员时hour分minute秒second
//为了保证数据的安全性，这三个成员变量应声明为私有。 为MyTime类定义构造方法
//以方便创建对象时初始化成员变量。 再定义diaplay方法用于将时间信息打印出来。 
//为MyTime类添加以下方法 addSecond(int sec) addMinute(int min) 
//addHour(int hou) subSecond(int sec) subMinute(int min) subHour(int hou) 分
//别对时、分、秒进行加减运算。测试类中循环打印时间（每过一秒）。
public class Test2 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyTime t=new MyTime(0,0,0);
		
while(true) {
	Thread.sleep(1000);
	t.addSecond(1);
	t.display();

}
	}

}
class MyTime{
	private int hour,minute,second;
	public  MyTime(int hour,int min,int second) {
		
		this.hour=hour;
		this.minute=min;
		this.second=second;
	}
	public void display(){
		
		System.out.println("现在的时间是"+hour+"小时"+minute+"分"+second+"秒");
	}
	
	public void addSecond(int sec) {
		this.second+=sec;
		if(this.second==60)
		{
			this.second=0;
			addMinute(1);
		}
	}
	public void addMinute(int min) {
		this.minute+=min;
		if(this.minute==60)
		{
			this.minute=0;
			this.hour++;
		}
	}
	public void addHour(int hou) {
		this.hour=hou+1;
	}
	public void subSecond(int sec) {
		this.second=sec-1;
	}
	public void subMinute(int min) {
		this.minute=min-1;

	}
	public void subHour(int hou) {
		this.hour=hou-1;
	} 
}

