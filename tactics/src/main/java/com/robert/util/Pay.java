package com.robert.util;

/**
 *环境类(Context):用一个对象来配置。维护一个对策略对象的引用。
 *
 * 这是一个支付整合类，也就是工具类，他把所有的支付方式进行整合
 *
 * @author robert
 * @date 2021/5/19 15:19
 */
public class Pay {

    private IPay pay;

    public Pay(IPay pay) {
        this.pay = pay;
    }

    //支付
    public void getPay(){
        pay.toPay();
    }
}
