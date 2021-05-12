package abstract_factory.impl;

import abstract_factory.IBenZi;

/**
 * @author robert
 * @date 2021/5/12 14:27
 */
public class BenZiSport implements IBenZi {
    @Override
    public void run() {
        System.out.println("我是奔驰的跑车哦");
    }
}
