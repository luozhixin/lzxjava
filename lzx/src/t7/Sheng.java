package t7;

public class Sheng extends Thread{
	private Store s;
	public Sheng(Store s) {
		this.s = s;
	}
	@Override
	public void run() {
		synchronized (s) {
			while(true){
				if(s.isB()==false){
					s.setCh((char)(s.getCh()+1));
					System.out.println("����������"+s.getCh());
					s.notify();
					s.setB(true);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(s.getCh()=='G'){
						return;
					}
				}else{
					System.out.println("�����߻�û������...");
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
