package Base;
//�������췽�������� 
//����һ�������û��઩Ҫ�������Ϣ���û�ID���û����롢email
//��ַ���ڽ������ʵ��ʱ��������������Ϣ����Ϊ
//���캯���Ĳ������목�����û�ID���û�����ʱ����Ϊȱʡ��email��ַ���û�ID�����ַ���"@gameschool.com"  
public class day2_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User(1, "4651	", 1761313 + "@gameschool.com");
		System.out.println("ID ��" + u.getId() + "\r �� �룺" + u.getPassword()
				+ "\remail��" + u.geteAddr());
 
	}
	
}
 class User {
	 private int id;
	 private String password;
	 private String eAddr;
	
	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public User(int id,String password,String eAddr){
		this.setId(id);
		this.setPassword(password);
		this.seteAddr(eAddr);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

