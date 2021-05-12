package abstract_factory;

import abstract_factory.impl.SportFactory;
import simple_factory.Factory;
import simple_factory.Operation;

/**
 *
 * 抽象工厂
 * @author robert
 * @date 2021/5/12 13:51
 */
public class Calculator {
    public static void main(String[] args) {
        ICarFactory factory = new SportFactory();
        IBenZi benZCar = factory.getBenZCar();
        benZCar.run();
        ITesila tesilaCar = factory.getTesilaCar();
        tesilaCar.test();
    }
}
