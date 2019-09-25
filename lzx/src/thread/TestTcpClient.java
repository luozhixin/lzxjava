package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestTcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket(InetAddress.getLocalHost(),8888);
		OutputStream os = s.getOutputStream();
		InputStream is = s.getInputStream();
		os.write("hello1\r\n".getBytes());
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String str = br.readLine();
		
		System.out.println(s.getInetAddress().getHostAddress()+" : "+str);
		String str1 = br.readLine();
		System.out.println(s.getInetAddress().getHostAddress()+" : "+str1);
		is.close();
		os.close();
		s.close();

	}

}
