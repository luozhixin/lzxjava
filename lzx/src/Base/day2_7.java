package Base;

//使用面向对象的思想描述西游记人物
//问题描述：
//针对如下描述，使用面向对象的思想，编写程序描述西游记中的人物
//孙悟空：猴子鼻，樱桃嘴，火眼，用金箍棒打妖精
//猪八戒：帅哥鼻，大头嘴，媚人眼，用锄头打妖精
//沙僧： 君子鼻，憨厚嘴，沙眼，用弯刀枪打妖精要求：
//1、	根据描述分析孙悟空、猪八戒和沙僧的共性，设计类的属性和方法
//2、 通过构造函数实现属性赋值
//3、	编写测试方法实现信息输出
//参考分析思路：
//1、	公共特征：都有名字，鼻子，嘴巴，眼睛
//2、	公共特征动作（方法）：打妖精、个人信息介绍
public class day2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sun s=new sun("孙悟空","猴子鼻","火眼","樱桃嘴");
		sha s2=new sha("沙僧","君子鼻","沙眼","憨厚嘴");
		zhu z=new zhu("猪八戒","帅哥鼻","媚人眼","大头嘴");
		s.print();
		z.print();
		s2.print();
		
	
	}

}
class sun{
	private String name;
	private String nose;
	private String eyes;
	private String mouth;
	String weapon="金箍棒";
	public sun(String name,String nose,String eyes,String mouth){
		this.setName(name);
		this.setNose(nose);
		this.setEyes(eyes);
		this.setMouth(mouth);
	}
	public void print() {
		//打印
		System.out.println(this.name+"外貌特征："+this.nose+","+this.mouth+","+this.eyes);
		System.out.println(this.name+"用"+this.weapon+"打妖精");
		System.out.println("==================================");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
}
class zhu{
	private String name;
    private String nose;
    private String eyes;
    private String mouth;
   String weapon="锄头";
public zhu(String name,String nose,String eyes,String mouth){
	this.setName(name);
	this.setNose(nose);
	this.setEyes(eyes);
	this.setMouth(mouth);
	}
public void print() {
	//打印
	System.out.println(this.name+"外貌特征："+this.nose+","+this.mouth+","+this.eyes);
	System.out.println(this.name+"用"+this.weapon+"打妖精");
	System.out.println("==================================");
	
}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
    }
class sha{	
	private String name;
	private String nose;
	private String eyes;
	private String mouth;
	 String weapon="弯刀枪";
public sha(String name,String nose,String eyes,String mouth){
	this.setName(name);
	this.setNose(nose);
	this.setEyes(eyes);
	this.setMouth(mouth);
	}
public void print() {
	//打印
	System.out.println(this.name+"外貌特征："+this.nose+","+this.mouth+","+this.eyes);
	System.out.println(this.name+"用"+this.weapon+"打妖精");
	
	
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}

}