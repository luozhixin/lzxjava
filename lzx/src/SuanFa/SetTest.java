package SuanFa;
import java.util.HashSet;
import java.util.Set;


public class SetTest {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();	
	while(true){
		int sui = (int) (Math.random() * 33) ;// ��ȡ33���ڵ����� 
		set.add(sui<10?"0"+sui:""+sui);//��Ԫ�ش��뼯����
		if (set.size() == 6) {//����������ɫ�������ѭ��
			break;
		}
	}
	Set<String> set2 = new HashSet<String>();
	int sui2 = (int) (Math.random() * 16) + 1;// ��ȡ16���ڵ�����
	set2.add(sui2<10?"0"+sui2:""+sui2);
	System.out.println("����" + set + " ����" + set2);

	
}
}
