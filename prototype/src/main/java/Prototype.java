/**
 * 原型设计模式
 * @Author robert
 * @Date 2021/3/23 11:44
 * @Version 1.0
 *
 * 原型设计模式是为了减少重复对象的创建次数，而是使用clone
 * 假设在我们使用构造方法的时候需要从数据库查询数据封装到实体中，
 * 每次创建都会进行查询数据库操作。在查询到的数据一定时间内不会改变的情况下这种行为是浪费性能的。
 *  我们可以在初始化的时候查询数据库数据封装到实体中，每次创建新的对象时复制此对象并返回。
 */
public class Prototype implements Cloneable{
    private String name;

    public Prototype(){
        this.name = "张三";
        System.out.println("这是在创建原型对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object clone2(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}

/**
 * 对象工厂
 */
class PrototypeFactory {

    //此处使用饿汉式单例模式 只执行一次构造方法 使用静态是为了保证构造只使用一次.如果使用多次那么和new一个对象没什么区别
    private static Prototype persion = new Prototype();

    public static Prototype getPersion(){

        return  (Prototype) persion.clone2();
    }
}

class Test{
    public static void main(String[] args) {
        thisTime();
        prototypeMode();
    }

    public  static void thisTime(){
        Prototype prototype = new Prototype();
        Prototype prototype1 = new Prototype();
        Prototype prototype2 = new Prototype();
    }

    public static void prototypeMode(){
            Prototype persion = PrototypeFactory.getPersion();
            Prototype persion1 = PrototypeFactory.getPersion();
            Prototype persion2 = PrototypeFactory.getPersion();
            System.out.println("地址值:"+persion );
            System.out.println("地址值:"+persion2);
            System.out.println("地址值:"+persion1);

    }
}
