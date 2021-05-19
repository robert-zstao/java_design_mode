package com.robert.util.impl;

import com.robert.util.IPay;

/**
 * @author robert
 * @date 2021/5/19 15:16
 */
public class WeChatPay implements IPay {

    public void toPay() {
        System.out.println("使用了微信支付");
    }

}
