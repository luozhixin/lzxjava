package Base;

//ʹ����������˼���������μ�����
//����������
//�������������ʹ����������˼�룬��д�����������μ��е�����
//����գ����ӱǣ�ӣ���죬���ۣ��ý𹿰�������
//��˽䣺˧��ǣ���ͷ�죬�����ۣ��ó�ͷ������
//ɳɮ�� ���ӱǣ������죬ɳ�ۣ����䵶ǹ������Ҫ��
//1��	����������������ա���˽��ɳɮ�Ĺ��ԣ����������Ժͷ���
//2�� ͨ�����캯��ʵ�����Ը�ֵ
//3��	��д���Է���ʵ����Ϣ���
//�ο�����˼·��
//1��	�����������������֣����ӣ���ͣ��۾�
//2��	������������������������������������Ϣ����
public class day2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sun s=new sun("�����","���ӱ�","����","ӣ����");
		sha s2=new sha("ɳɮ","���ӱ�","ɳ��","������");
		zhu z=new zhu("��˽�","˧���","������","��ͷ��");
		s.print();
		z.print();
		s2.print();
		
	
	}

}
class sun{
	private String name;
	private String nose;
	private String eyes;
	private String mouth;
	String weapon="�𹿰�";
	public sun(String name,String nose,String eyes,String mouth){
		this.setName(name);
		this.setNose(nose);
		this.setEyes(eyes);
		this.setMouth(mouth);
	}
	public void print() {
		//��ӡ
		System.out.println(this.name+"��ò������"+this.nose+","+this.mouth+","+this.eyes);
		System.out.println(this.name+"��"+this.weapon+"������");
		System.out.println("==================================");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
}
class zhu{
	private String name;
    private String nose;
    private String eyes;
    private String mouth;
   String weapon="��ͷ";
public zhu(String name,String nose,String eyes,String mouth){
	this.setName(name);
	this.setNose(nose);
	this.setEyes(eyes);
	this.setMouth(mouth);
	}
public void print() {
	//��ӡ
	System.out.println(this.name+"��ò������"+this.nose+","+this.mouth+","+this.eyes);
	System.out.println(this.name+"��"+this.weapon+"������");
	System.out.println("==================================");
	
}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
    }
class sha{	
	private String name;
	private String nose;
	private String eyes;
	private String mouth;
	 String weapon="�䵶ǹ";
public sha(String name,String nose,String eyes,String mouth){
	this.setName(name);
	this.setNose(nose);
	this.setEyes(eyes);
	this.setMouth(mouth);
	}
public void print() {
	//��ӡ
	System.out.println(this.name+"��ò������"+this.nose+","+this.mouth+","+this.eyes);
	System.out.println(this.name+"��"+this.weapon+"������");
	
	
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}

}