package abstract_factory.impl;

import abstract_factory.ITesila;

/**
 * @author robert
 * @date 2021/5/12 14:30
 */
public class TesilaBusiness implements ITesila {
    @Override
    public void test() {
        System.out.println("我是商务车，我刹车也不行");
    }
}
