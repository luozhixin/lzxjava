package OOP;

//��дһ���࣬�ܹ�ʵ��ʱ����Զ����ӣ�����Ӧ���������ͳ�Աʱ��hour�����֪�minute�����몥second��
//Ϊ�˱�֤���ݵİ�ȫ�ԣ���������Ա����Ӧ����Ϊ˽�С� ΪMyTime�ඨ�幹�췽��
//���Է��㴴������ʱ��ʼ����Ա������ �ٶ���diaplay���������ڽ�ʱ����Ϣ��ӡ������ 
//ΪMyTime��������·����� addSecond(int sec) addMinute(int min) 
//addHour(int hou) subSecond(int sec) subMinute(int min) subHour(int hou) ��
//���ʱ���֡�����мӼ����㡣��������ѭ����ӡʱ�䣨ÿ��һ�룩��
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
		
		System.out.println("���ڵ�ʱ����"+hour+"Сʱ"+minute+"��"+second+"��");
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

