package factory_way.impl;

import factory_way.IFactory;

/**
 * @author robert
 * @date 2021/5/12 14:20
 */
public class SubFactory implements IFactory {
    @Override
    public Operation CreateOption() {
        return new OperationSub();
    }
}
