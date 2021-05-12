package factory_way;

import factory_way.impl.AddFactory;
import factory_way.impl.Operation;
import simple_factory.Factory;

/**
 *
 * 工厂方法
 * @author robert
 * @date 2021/5/12 13:51
 */
public class Calculator {
    public static void main(String[] args) {
        IFactory addFactory = new AddFactory();
        Operation operation = addFactory.CreateOption();
        operation.setOne(10);
        operation.setTwo(5);
        System.out.println(operation.getResult());
    }
}
