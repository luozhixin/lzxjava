package Base;
//.���췽���� ��дJava����������ʾ�˵����������䡣 ����һ�����થPerson������Ӧ��
//������˽�����Ԫ�������name�������䪥age�������幹�췽����
//������ʼ�����ݳ�Ա���ٶ�����ʾ��display���������������������ӡ������
//��main�����д��������ʵ����Ȼ�󣬽���Ϣ��ʾ�� 
public class day2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person("tom",18); 
System.out.println("���֣�"+p.name+"    ���䣺"+p.age);
	}

}
class  Person { 
String name; 
int age; 
public Person(String name,int age){ 
this.name=name; 
this.age=age; 
}
}