package thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTcpServer {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		byte [] b = new byte[1024];//"10.28.7.81"
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(8888);	//当前程序绑定当前电脑的端口8888  端口从0-65535  一般来说我们是1024以上的 1024以下的系统已经占用
		while(true){
			try {
				Socket s = ss.accept();	//监听端口  有没有谁来访问改端口 建立tcp链接   有的话建立链接 获得跟对方的socket链接对象
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				os.write("hello1".getBytes());
				String str = br.readLine();
				System.out.println(s.getInetAddress().getHostAddress()+" : "+str);
				bw.write("我是老师\r\n");
				bw.flush();
				os.close();
				is.close();
				s.close();
			} catch (Exception e) {
				System.out.println("异常");
			}
		}
		
	}
}
