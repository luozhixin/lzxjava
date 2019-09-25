package thread2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

public class TestTcpServer {
	public static List<BufferedWriter> list = new Vector<>();
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		byte [] b = new byte[1024];//"10.28.7.81"
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(8888);	//当前程序绑定当前电脑的端口8888  端口从0-65535  一般来说我们是1024以上的 1024以下的系统已经占用
		while(true){
			try {
				Socket s = ss.accept();	//监听端口  有没有谁来访问改端口 建立tcp链接   有的话建立链接 获得跟对方的socket链接对象
				T1 t = new T1(s);
				t.start();
			} catch (Exception e) {
				
			}
		}
	}
}
