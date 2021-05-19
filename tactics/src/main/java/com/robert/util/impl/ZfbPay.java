package com.robert.util.impl;

import com.robert.util.IPay;

/**
 * @author robert
 * @date 2021/5/19 15:15
 */
public class ZfbPay implements IPay {

    public void toPay() {
        //其实就是处理逻辑的地方
        System.out.println("使用支付宝进行支付");
    }
}
