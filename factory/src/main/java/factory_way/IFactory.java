package factory_way;

import factory_way.impl.Operation;

/**
 * @author robert
 * @date 2021/5/12 14:18
 */
public interface IFactory {

    Operation CreateOption();
}
