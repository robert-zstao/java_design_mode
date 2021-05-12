package abstract_factory.impl;

import abstract_factory.IBenZi;
import abstract_factory.ICarFactory;
import abstract_factory.ITesila;

/**
 *
 * 具体的跑车工厂
 * @author robert
 * @date 2021/5/12 14:32
 */
public class SportFactory implements ICarFactory {
    @Override
    public IBenZi getBenZCar() {
        return new BenZiSport();
    }

    @Override
    public ITesila getTesilaCar() {
        return new TesilaSport();
    }
}
