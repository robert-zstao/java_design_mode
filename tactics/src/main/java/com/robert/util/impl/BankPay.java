package com.robert.util.impl;

import com.robert.util.IPay;

/**
 * @author robert
 * @date 2021/5/19 15:17
 */
public class BankPay implements IPay {
    public void toPay() {
        System.out.println("使用了银行卡支付！");
    }
}
