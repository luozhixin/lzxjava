package Extends;


public class Homework1 {//测试类
	
	public static void main(String[] args) {
		Staff  s1=new Staff("张晓彤",36, "人事部", "经理");
		s1.Selfintroduction();
		Staff  s2=new Staff("李大宝",24, "人事部", "经理");
		s2.Selfintroduction();
	}
}
class Staff{
	private int age;
	private String sex;
	private String name;
	private String department;
	private String post;
	public Staff(String name,int age,String department,String post) {
		setAge(age);
		setDepartment(department);
		setName(name);
		setPost(post);
		// TODO Auto-generated constructor stub
	}
	void Selfintroduction() {
		System.out.println("大家好，我叫"+getName()+",今年"+getAge()+"岁");
		System.out.println("我现在任职在"+getDepartment()+",是"+getDepartment()+getPost());
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
}
class Department{
	private int DId;
	private String DName;
	public int getDId() {
		return DId;
	}
	public void setDId(int dId) {
		DId = dId;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	
}