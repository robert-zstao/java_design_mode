package factory_way.impl;


import factory_way.IFactory;

/**
 * 加法工厂
 * @author robert
 * @date 2021/5/12 14:19
 */
public class AddFactory implements IFactory {
    @Override
    public Operation CreateOption() {
        return new Add();
    }
}
