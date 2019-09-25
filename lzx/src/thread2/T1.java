package thread2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import thread2.TestTcpServer;

public class T1 extends Thread {
	private Socket s;

	public T1(Socket s) {
		this.s = s;
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = s.getInputStream();
			os = s.getOutputStream();
		} catch (IOException e1) {
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		TestTcpServer.list.add(bw);
		try {
			while (true) {
				String str = br.readLine();
				
					synchronized (TestTcpServer.list) {
					for (BufferedWriter bw1 : TestTcpServer.list) {
						if(str==null){
					break;
				}
						if (TestTcpServer.list.indexOf(str)==-1) {
							bw1.write(s.getInetAddress().getHostAddress() + ":" + str + "\r\n");
							bw1.flush();
							System.out.println(s.getInetAddress().getHostAddress() + ":" + str);
							break;
						}
					}
					
				}
			}
		} catch (IOException e) {
			TestTcpServer.list.remove(bw);
		}finally {
			try {
				bw.close();
				br.close();
				is.close();
				os.close();
				s.close();
			} catch (IOException e) {
			}
		}
	}
}
