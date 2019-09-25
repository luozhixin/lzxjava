package t7;

public class Xiao extends Thread{
	private Store s;
	public Xiao(Store s) {
		this.s = s;
	}
	@Override
	public void run() {
		synchronized (s) {
			while(true){
				if(s.isB()){
					System.out.println("消费者消费了:"+s.getCh());
					s.notify();
					s.setB(false);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(s.getCh()=='G'){
						return;
					}
				}else{
					System.out.println("等待生产者生产...");
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
