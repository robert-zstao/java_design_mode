package abstract_factory.impl;

import abstract_factory.ITesila;

/**
 * @author robert
 * @date 2021/5/12 14:29
 */
public class TesilaSport implements ITesila {
    @Override
    public void test() {
        System.out.println("我是特斯拉的跑车，我刹车不行！");
    }
}
