package thread2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class T2 extends Thread{
	private BufferedWriter bw ;
	public T2(BufferedWriter bw) {
		this.bw = bw;
	}
	@Override
	public void run() {
		Scanner in = new Scanner(System.in);
		while(true){
			try {
				bw.write(in.next()+"\r\n");
			} catch (IOException e) {
				break;
			}
		}
		in.close();
	}
}
