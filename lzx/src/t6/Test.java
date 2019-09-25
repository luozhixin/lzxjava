package t6;

/**
 * 同步线程之间是如何通信的？  协调工作。
 * 要求：张三和张三老婆一人取一次钱。
 * 需要两个线程之间有协作关系
 * */
public class Test {

	public static void main(String[] args) {
		Money m = new Money();
		m.setNum(1001);
		m.setB(true);
		T2 t1 = new T2(m);
		T3 t2 = new T3(m);
		t1.setName("张三");
		t2.setName("张三老婆");
		t1.start();
		t2.start();
	}
}
