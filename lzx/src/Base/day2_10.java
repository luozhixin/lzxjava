package Base;
import java.util.Scanner;

//��д�����������д�����Ϣ
//����������
//ĳ��˾Ҫ���������й���ϵͳ������ʹ����������˼�룬������еĴ�����Ϣ
//Ҫ��
//1�� �������������Ժͷ�������ƴ�����
//2�� �������Ե�˽�з���Ȩ�ޣ�ͨ�����е� get��set ����ʵ�ֶ����Եķ���
//3�� ��д�����࣬���Դ�����Ķ�����ط���������������Ϣ�Զ���
//4�� ������ info---��Ŵ����࣬������ test---��Ų�����
//�ο�����˼·�������ࣺ
//����: �û����������롢���֤�š��˺š��ʻ�������
//1������֤�˺��Ƿ���Ч��������Ƿ���Ч�������Ч�޸��˻����
//2�� ȡ���֤�˺��Ƿ���Ч��ȡ�����Ƿ���Ч������Ƿ��ã������Ч�޸����
//����Ч����
public class day2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankmanager bank=new bankmanager("1797654231","������",2000); 
		System.out.println("�������˺ţ�1797654231����");
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		String account=input.next();
		if(account.equals(bank.getAccount())){
			System.out.println("���������");
			int money =input.nextInt();
			bank.deposit(money);
			bank.println();
			System.out.println("===========");
			System.out.println("������ȡ���");
			int money2 =input.nextInt();
			bank.Withdrawmoney(money2);
		}else{
			System.out.println("�˺Ŵ���");
			
		}
	}

}
class bankmanager{
	private String account;//�˺�
	private String name;//����
	private int balance;//���
	
	public bankmanager(String account,String name,int balance){
		this.setAccount(account);
		this.setBalance(balance);
		this.setName(name);
		
	}
	public void println(){
		//��ӡ�˻���Ϣ
		System.out.println("��������:"+this.name);
		System.out.println("�˺�:"+this.account);
		System.out.println("���:"+this.balance);
	}
	public void deposit(int money) {//���
		
		this.balance+=money;
		System.out.println("���ɹ�!");
	}
    public void Withdrawmoney(int money) {//ȡ��
		if(money>this.balance) {
			System.out.println("����");
		}else {
			this.balance-=money;
			System.out.println("ȡ��ɹ�");
		}
		
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}