package Base;
//模拟简单的计算器。 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。编
//写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、
//乘multiplication、除division等公有成员方
//法，分别对两个成员变量执行加、减、乘、除的运算。 在main方法中创建Number类的对象调用各个方法并显示计算结果。 
public class day2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Number n=new Number(15,30);
        n.addition();
        n.division();
        n.multiplication();
        n.subtration();
	}

}
class Number{
	private double n1;
	private double n2;
	public Number(double x,double y) {
		this.n1=x;
		this.n2=y;
		System.out.println("n1="+n1+"   n2="+n2);
	}
	public void addition() {
		System.out.println("n1+n2="+(n1+n2));
	}
	public void subtration() {
		System.out.println("n1-n2="+(n1-n2));
	}
	public void multiplication() {
		System.out.println("n1*n2="+(n1*n2));
	}
	public void division () {
		System.out.println("n1/n2="+(n1/n2));
	}
}