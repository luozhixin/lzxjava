package t7;

public class Test {

	public static void main(String[] args) {
		Store s = new Store();
		Sheng s1 = new Sheng(s);
		Xiao s2 = new Xiao(s);
		s1.start();
		s2.start();
	}

}
