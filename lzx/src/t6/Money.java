package t6;

public class Money {
	private int num;	//存款余额
	private boolean b;	//信号量,用于表示应该谁取钱   true表示张三
	public void setB(boolean b) {
		this.b = b;
	}
	public boolean getB() {
		return b;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
