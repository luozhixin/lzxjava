package Base;


//��д��������Ӣ�ۺͼ���
//����������˾Ҫ��������Ϸ��������������˼�����Ӣ����ͼ����ࡣ�����趨������
//���԰������������ơ��������������������ܵȼ�
//Ӣ����:
//���԰�����Ӣ�����֡�����ֵ���������������������յļ���
//����������ѧϰ�¼��ܵķ����������ķ����������ķ���
//Ҫ��
//1��	�������Ե�˽�з���Ȩ�ޣ�ͨ�����е� get��set ����ʵ�ֶ����Եķ���
//2��	ѧϰ�¼��ܵķ�������Ҫ�ж��¼��ܵȼ��Ƿ�����Ѿ����ռ��ܵȼ���������������������ѧϰ
//3��	����������������״̬�����ݰ���Ӣ�����֣�����ֵ�������������й�����=���˹�����+���ܹ�����
//4�� ��������ͨ������������չ���������Ҫ�жϣ����������С�ڷ��������˺�ֵ=0����֮���˺�ֵ=������-�������������˺�ֵ�����ʾ��ͬ�ķ�����Ϣ�����ݰ���Ӣ�����֣��������������������ֵ�����з�����=���˷�����+���ܷ�����
//5�� ��д�����࣬���켼�ܶ����Ӣ�۶��󣬲�������ط���������������Ϣ�Զ���
public class day2_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h=new hero("��С��",300,"��ɽ��ţ",40,30);
		skill s=new skill("������Ѩ��",1,50,40);
		h.Aggressivity();
		System.out.println("==========================");
		h.Defensive(h.getAggressivity());
		System.out.println("==========================");
		s.learn();
	}

}
class hero{
	private int Lifevalue;//����ֵ
	private String skill;//����
	private String name;//����
	private int Aggressivity;//������
	private int Defensivepower;//������
	public  hero(String name,int Lifevalue,String skill,int Aggressivity,int Defensivepower) {
		this.setAggressivity(Aggressivity);
		this.setDefensivepower(Defensivepower);
		this.setLifevalue(Lifevalue);
		this.setName(name);
		this.setSkill(skill);
		
	}
	public void Aggressivity() {//��������
		System.out.println("Ӣ��"+this.name+"չ������");
		System.out.println("��ǰ������ֵ�ǣ�"+this.Lifevalue);
		System.out.println("�������ǣ�"+this.Aggressivity);
		
		
	}
	public void Defensive(int Aggressivity) {//��������
		if(this.Defensivepower<Aggressivity) {
			System.out.println("����ʧ�ܣ�");
			System.out.println("Ӣ��"+this.name+"��"+this.Defensivepower+"�ķ�����δ�ܵ�������");
			this.Lifevalue=Aggressivity-this.Defensivepower;
		}else {
			System.out.println("�����ɹ���");
		}
		System.out.println("��ǰ����ֵΪ��"+this.Lifevalue);
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getDefensivepower() {
		return Defensivepower;
	}
	public void setDefensivepower(int defensivepower) {
		Defensivepower = defensivepower;
	}
	public hero(int l,String n,int a) {
		this.setLifevalue(l);
		this.setName(n);
		this.setAggressivity(a);
		
	}
	public void sub(int l) {
		this.Lifevalue-=l;
		
	}
	
	public int getLifevalue() {
		return Lifevalue;
	}
	public void setLifevalue(int lifevalue) {
		Lifevalue = lifevalue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAggressivity() {
		return Aggressivity;
	}
	public void setAggressivity(int aggressivity) {
		Aggressivity = aggressivity;
	}


}
class skill{
	private String skillname;//��������
	private int level;//�ȼ�
	private int Aggressivity;//������
	private int Defensivepower;//������
	public skill(String skillname,int level,int Aggressivity,int Defensivepower){
		this.setAggressivity(Aggressivity);
		this.setDefensivepower(Defensivepower);
		this.setLevel(level);
		this.setSkillname(skillname);
	}
	public void learn() {
		if(this.level>4) {
			System.out.println("ѧϰ�˼���");
		}else {
			System.out.println(this.skillname+"�ȼ����ͣ�����Ҫѧϰ");
		}
		
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	
	public int getAggressivity() {
		return Aggressivity;
	}
	public void setAggressivity(int aggressivity) {
		Aggressivity = aggressivity;
	}
	public int getDefensivepower() {
		return Defensivepower;
	}
	public void setDefensivepower(int defensivepower) {
		Defensivepower = defensivepower;
	}
	
	
	
}
