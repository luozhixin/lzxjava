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
		ServerSocket ss = new ServerSocket(8888);	//��ǰ����󶨵�ǰ���ԵĶ˿�8888  �˿ڴ�0-65535  һ����˵������1024���ϵ� 1024���µ�ϵͳ�Ѿ�ռ��
		while(true){
			try {
				Socket s = ss.accept();	//�����˿�  ��û��˭�����ʸĶ˿� ����tcp����   �еĻ��������� ��ø��Է���socket���Ӷ���
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				os.write("hello1".getBytes());
				String str = br.readLine();
				System.out.println(s.getInetAddress().getHostAddress()+" : "+str);
				bw.write("������ʦ\r\n");
				bw.flush();
				os.close();
				is.close();
				s.close();
			} catch (Exception e) {
				System.out.println("�쳣");
			}
		}
		
	}
}
