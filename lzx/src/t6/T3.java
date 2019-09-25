package t6;

/**
 * 多个线程共享资源
 */
public class T3 extends Thread {
	private Money m;

	public T3(Money m) {
		this.m = m;
	}

	@Override
	public void run() {
		synchronized (m) {
			while (true) {
					if(m.getB()==false){
						if(m.getNum() > 100){
							m.setNum(m.getNum()-100);
							System.out.println(getName()+":取钱100！余额是"+m.getNum());
						}else{
							System.out.println("没钱了");
							m.setB(true);
							m.notify();
							return;
						}
						m.notify();
						m.setB(true);
					}else{
						try {
							m.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
		}
	}
}
