package t6;

/**
 * ����̹߳�����Դ
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
							System.out.println(getName()+":ȡǮ100�������"+m.getNum());
						}else{
							System.out.println("ûǮ��");
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
