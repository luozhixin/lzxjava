package test;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/8 10:20
 * @Description:
 */
public class Single {
    private  static Single single;

    private Single(){};

    public static Single getSingle() {
        single=new Single();
        return single;
    }
}
//����ģʽ��ָһ��ʼ�����г�ʼ��������ģʽ��ָһ��ʼ�ͽ��г�ʼ���������ײ���������



//˫����ģʽ
class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}



//��̬�ڲ��൥��ģʽ
class SingletonTest {
    private SingletonTest(){
    }
    public static SingletonTest getInstance(){
        return Inner.instance;
    }
    private static class Inner {
        private static final SingletonTest instance = new SingletonTest();
    }
}