package Base;
//��д�������� IT ��ҵ��
//����������
//����������˼�룬��д�Զ��������� IT ��ҵ�ߡ��趨���԰��������������䣬�������򣬹������ޣ�����������������
//Ҫ��
//1��	�������Ե�˽�з���Ȩ�ޣ�ͨ�����е� get��set ����ʵ�ֶ����Եķ���
//2��	�޶� IT ��ҵ��Ա�������� 15 �꣬��Ч��Ϣ����ʾ��������Ĭ������Ϊ 15 3�� �޶�������������ֻ������
//4��	��ƹ��캯��ʵ�ֶ����Ը�ֵ
//5��	��������ͨ��������������չ�����λ��ְ��������˹�����Ϣ
//6�� ��д�����࣬���� IT ��ҵ����Ķ�����ط���������������Ϣ�Զ���
public class day2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		itpractitioners itp=new itpractitioners("л��",13,10,"����Ժ","�˲��ˮ","С��");
		itp.println();

	}

}
class itpractitioners{
	private int age;//����
	private String name;//����
	private int workingage;//��������
	private String workingplace;//�����ص�
	private String TechnicalDirection;//��������
	private String post;//ְλ
	public itpractitioners(String name,int age,int workingage,String workingplace,String TechnicalDirection,String post) {
		if(age<15) {
		this.age=15;
		System.out.println("������Ϣ��Ч!���޸�Ĭ������Ϊ15");

		}else {
			this.setAge(age);
		}
		this.setWorkingage(workingage);
		this.setName(name);
		this.setPost(post);
		this.TechnicalDirection = TechnicalDirection;
		this.setWorkingplace(workingplace);
		
		
	}
	public void println(){ // �������
        System.out.println("����:"+name);
        System.out.println("����:"+age);
        System.out.println("��������:"+TechnicalDirection);
        System.out.println("��������:"+workingage);
        System.out.println("Ŀǰ��ְ��:"+workingplace);
        System.out.println("ְ����:"+post);
    }

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkingage() {
		return workingage;
	}
	public void setWorkingage(int workingage) {
		this.workingage = workingage;
	}
	public String getWorkingplace() {
		return workingplace;
	}
	public void setWorkingplace(String workingplace) {
		this.workingplace = workingplace;
	}
	public String getTechnicalDirection() {
		return TechnicalDirection;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
}