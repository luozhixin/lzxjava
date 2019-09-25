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
		 hero=new Hero("张三三",100,100,20,3,"排山倒海",0);
		 gw=new Guaiwu("火龙",100,100,5,4);
		 jn=new Jineng("排山倒海",1,5);
		 @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); 
		 System.out.print("是否开始游戏？（y/n）：");
		 String q=input.next();
		 if(q.equals("y")){
			 kaishi();
		 }
	}
	static void kaishi(){
		 @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); 
		System.out.println(hero.getName()+"开始进攻");
		hero.gjcs();//攻击次数
		gw.ptgj(hero.getGongji());
		 if(hero.getGongjinum()/3>=a){
			 System.out.println("释放技能"+hero.getSkill());
			 System.out.println("技能攻击力："+jn.getJinenggji());
			 a++;
			 gw.jn(jn.getJinenggji());
		 }
		 if(hero.getGongjinum()/10>=b){
			 System.out.println("技能等级提升");
			 b++;
			 jn.adddj();
		 }
		System.out.println("第"+hero.getGongjinum()+"次攻击");
		System.out.println(gw.getName()+"开始进攻");
		hero.ptgj(gw.getGongji());
		hero.hp();
		gw.gp();
		if(gw.getLiveValue()<=0){
			System.out.println("怪物已被击杀");
		}
		if(hero.getLiveValue()<=0){
			System.out.println("英雄已被击杀");
		}
		if(gw.getLiveValue()>0&&hero.getLiveValue()>0){
		System.out.print("是否继续？（y/n）：");
		String q=input.next();
		if(q.equals("y")){
			kaishi();
		}else{
			System.out.println("游戏结束");
		}
		}
	}

}
class Hero{
	//英雄类:有名字、血量、蓝量、攻击力、防御力、所学技能，
	//英雄每对战10次升级技能，每攻击3次释放技能。攻击方法
	Jineng jn;
	Guaiwu gw;
	String name;
	int liveValue;
	int lanliang;
	int gongji;//攻击力
	int fangyu;//防御力
	String skill;
	int gongjinum;//攻击次数

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
		System.out.println("英雄姓名："+getName());
		System.out.println("英雄生命值："+getLiveValue());
		System.out.println("英雄蓝量："+getLanliang());
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
	int gongji;//攻击力
	int fangyu;//防御力
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
		System.out.println("怪物名字："+getName());
		System.out.println("怪物生命值："+getLiveValue());
			
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
class Jineng{//技能
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
