import java.security.Signature;

/**
 * @Author robert
 * @Date 2021/3/23 10:27
 * @Version 1.0
 * 单例模式
 */
public class Singleton {

    private String name;
    /**
     * 饿汉式
     */
    //private static Singleton singleton = new Singleton();
    // private static Singleton singleton = null;

     private volatile static Singleton singleton = null;

    /**
     * 私有化构造方法
     */
    private Singleton(){}

//    public static Singleton getInstance(){
//        return singleton;
//    }
    /*
    懒汉式
     */
//    public static Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
    /*
   懒汉式锁
    */
//    public static synchronized Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    /**
     * 双重锁
     * @return
     */
    public static synchronized Singleton getInstance(){
        Singleton lock = singleton;
        if(singleton == null){
            synchronized (Singleton.class){
                lock = singleton;
                if(lock == null){
                    singleton = lock = new Singleton();
                }
            }

        }
        return lock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Test{
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.setName("张三");
        Singleton instance1 = Singleton.getInstance();
        instance1.setName("李四");

        System.out.println(instance == instance1);
        System.out.println(instance.getName());
    }
}