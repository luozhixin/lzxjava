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
		ServerSocket ss = new ServerSocket(8888);	//��ǰ����󶨵�ǰ���ԵĶ˿�8888  �˿ڴ�0-65535  һ����˵������1024���ϵ� 1024���µ�ϵͳ�Ѿ�ռ��
		while(true){
			try {
				Socket s = ss.accept();	//�����˿�  ��û��˭�����ʸĶ˿� ����tcp����   �еĻ��������� ��ø��Է���socket���Ӷ���
				T1 t = new T1(s);
				t.start();
			} catch (Exception e) {
				
			}
		}
	}
}
