package OOP;

import java.util.Scanner;

public class Test1 {
	static int a=1;
	static int b=1;
 static Hero hero;
 static Guaiwu gw;
 static Jineng jn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 hero=new Hero("������",100,100,20,3,"��ɽ����",0);
		 gw=new Guaiwu("����",100,100,5,4);
		 jn=new Jineng("��ɽ����",1,5);
		 @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); 
		 System.out.print("�Ƿ�ʼ��Ϸ����y/n����");
		 String q=input.next();
		 if(q.equals("y")){
			 kaishi();
		 }
	}
	static void kaishi(){
		 @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); 
		System.out.println(hero.getName()+"��ʼ����");
		hero.gjcs();//��������
		gw.ptgj(hero.getGongji());
		 if(hero.getGongjinum()/3>=a){
			 System.out.println("�ͷż���"+hero.getSkill());
			 System.out.println("���ܹ�������"+jn.getJinenggji());
			 a++;
			 gw.jn(jn.getJinenggji());
		 }
		 if(hero.getGongjinum()/10>=b){
			 System.out.println("���ܵȼ�����");
			 b++;
			 jn.adddj();
		 }
		System.out.println("��"+hero.getGongjinum()+"�ι���");
		System.out.println(gw.getName()+"��ʼ����");
		hero.ptgj(gw.getGongji());
		hero.hp();
		gw.gp();
		if(gw.getLiveValue()<=0){
			System.out.println("�����ѱ���ɱ");
		}
		if(hero.getLiveValue()<=0){
			System.out.println("Ӣ���ѱ���ɱ");
		}
		if(gw.getLiveValue()>0&&hero.getLiveValue()>0){
		System.out.print("�Ƿ��������y/n����");
		String q=input.next();
		if(q.equals("y")){
			kaishi();
		}else{
			System.out.println("��Ϸ����");
		}
		}
	}

}
class Hero{
	//Ӣ����:�����֡�Ѫ����������������������������ѧ���ܣ�
	//Ӣ��ÿ��ս10���������ܣ�ÿ����3���ͷż��ܡ���������
	Jineng jn;
	Guaiwu gw;
	String name;
	int liveValue;
	int lanliang;
	int gongji;//������
	int fangyu;//������
	String skill;
	int gongjinum;//��������

	Hero(String name,int liveValue,int lanliang,int gongji,
			int fangyu,String skill,int gongjinum){
		setFangyu(fangyu);
		setGongji(gongji);
		setGongjinum(gongjinum);
		setLanliang(lanliang);
		setLiveValue(liveValue);
		setName(name);
		setSkill(skill);
	}

	 void ptgj(int i) {
		// TODO Auto-generated method stub
		 this.liveValue=this.liveValue-(i-this.fangyu);
	}

	public void gjcs() {
		 gongjinum++;
	}

	void hp(){
		System.out.println("Ӣ��������"+getName());
		System.out.println("Ӣ������ֵ��"+getLiveValue());
		System.out.println("Ӣ��������"+getLanliang());
			}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLiveValue() {
		return liveValue;
	}
	public void setLiveValue(int liveValue) {
		this.liveValue = liveValue;
	}
	public int getLanliang() {
		return lanliang;
	}
	public void setLanliang(int lanliang) {
		this.lanliang = lanliang;
	}
	public int getGongji() {
		return gongji;
	}
	public void setGongji(int gongji) {
		this.gongji = gongji;
	}
	public int getFangyu() {
		return fangyu;
	}
	public void setFangyu(int fangyu) {
		this.fangyu = fangyu;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getGongjinum() {
		return gongjinum;
	}
	public void setGongjinum(int gongjinum) {
		this.gongjinum = gongjinum;
	}
	
}
class Guaiwu{
	Jineng jn;
	Hero h;
	String name;
	int liveValue;
	int lanliang;
	int gongji;//������
	int fangyu;//������
	Guaiwu(String name,int liveValue,int lanliang,
	int gongji,int fangyu){
		setFangyu(fangyu);
		setGongji(gongji);
		setLanliang(lanliang);
		setLiveValue(liveValue);
		setName(name);
	}
	public void ptgj(int i) {
		// TODO Auto-generated method stub
		this.liveValue=this.liveValue-(i-this.fangyu);
	}
	void jn(int i) {
		// TODO Auto-generated method stub
		this.liveValue=this.liveValue-(i-this.fangyu);
	}
	void gp(){
		System.out.println("�������֣�"+getName());
		System.out.println("��������ֵ��"+getLiveValue());
			
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLiveValue() {
		return liveValue;
	}
	public void setLiveValue(int liveValue) {
		this.liveValue = liveValue;
	}
	public int getLanliang() {
		return lanliang;
	}
	public void setLanliang(int lanliang) {
		this.lanliang = lanliang;
	}
	public int getGongji() {
		return gongji;
	}
	public void setGongji(int gongji) {
		this.gongji = gongji;
	}
	public int getFangyu() {
		return fangyu;
	}
	public void setFangyu(int fangyu) {
		this.fangyu = fangyu;
	}
	
}
class Jineng{//����
	String name;
	int dengji;
	int jinenggji;
	Jineng(String name,int dj,int jg){
		setDengji(dj);
		setJinenggji(jg);
		setName(name);
	}
	public void adddj() {
		dengji++;
		jinenggji++;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDengji() {
		return dengji;
	}
	public void setDengji(int dengji) {
		this.dengji = dengji;
	}
	public int getJinenggji() {
		return jinenggji;
	}
	public void setJinenggji(int jinenggji) {
		this.jinenggji = jinenggji;
	}
	
}
