package t6;

/**
 * ͬ���߳�֮�������ͨ�ŵģ�  Э��������
 * Ҫ����������������һ��ȡһ��Ǯ��
 * ��Ҫ�����߳�֮����Э����ϵ
 * */
public class Test {

	public static void main(String[] args) {
		Money m = new Money();
		m.setNum(1001);
		m.setB(true);
		T2 t1 = new T2(m);
		T3 t2 = new T3(m);
		t1.setName("����");
		t2.setName("��������");
		t1.start();
		t2.start();
	}
}
