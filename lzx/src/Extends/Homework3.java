package Extends;

public class Homework3 {//测试类

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpu c;
		c=new Computer("Intel酷睿", 3.4, "六核", "戴尔E530", "i9 9700");
		((Computer) c).run();
		c.work();
	}

}
abstract class Cpu{
	private double Mainfrequency;
	private String corenum;
	private String Model;
	public double getMainfrequency() {
		return Mainfrequency;
	}
	public void setMainfrequency(double mainfrequency) {
		Mainfrequency = mainfrequency;
	}
	
	public String getCorenum() {
		return corenum;
	}
	public void setCorenum(String corenum) {
		this.corenum = corenum;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public abstract void work();
}
class Computer extends Cpu{
	private String cpu;
	private int MemoryCapacity;
	private int DiskCapacity;
	private String CType;

	public Computer(String cpu,double mainfrequency,String corenum,String cType,String model) {
		setCpu(cpu);
		setCType(cType);
		setCorenum(corenum);
		setMainfrequency(mainfrequency);
		setModel(model);
		
		// TODO Auto-generated constructor stub
	}
	public void run() {
		System.out.println(getCType()+"开机运行");
	}

	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public int getMemoryCapacity() {
		return MemoryCapacity;
	}


	public void setMemoryCapacity(int memoryCapacity) {
		MemoryCapacity = memoryCapacity;
	}


	public int getDiskCapacity() {
		return DiskCapacity;
	}


	public void setDiskCapacity(int diskCapacity) {
		DiskCapacity = diskCapacity;
	}


	public String getCType() {
		return CType;
	}


	public void setCType(String cType) {
		CType = cType;
	}


	@Override
	public void work() {
		System.out.println(getCpu()+getCorenum()+getModel()+"开始工作");
		System.out.println("主频："+getMainfrequency());
		System.out.println("核心数量："+getCorenum()+"心");
		// TODO Auto-generated method stub
		
	}
	
}