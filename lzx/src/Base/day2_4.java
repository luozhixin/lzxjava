package Base;
//ģ��򵥵ļ������� ������ΪNumber���ધ�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С���
//д���췽��������n1��n2��ʼֵ����Ϊ���ඨ���addition��������subtration����
//�˪�multiplication��������division���ȹ��г�Ա��
//�����ֱ��������Ա����ִ�мӡ������ˡ��������㡣 ��main�����д���Number��Ķ��󪧵��ø�������������ʾ�������� 
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