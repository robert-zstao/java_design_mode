package simple_factory;

/**
 *
 * 简单工厂
 * @author robert
 * @date 2021/5/12 13:51
 */
public class Calculator {
    public static void main(String[] args) {
        Operation first = Factory.getFactory("+");
        first.setOne(10);
        first.setTwo(6);
        System.out.println(first.getResult());
    }
}
