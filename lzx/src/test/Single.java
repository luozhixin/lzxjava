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
//懒汉模式是指一开始不进行初始化，饿汉模式是指一开始就进行初始化，但容易产生垃圾。



//双重锁模式
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



//静态内部类单例模式
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