package com.robert.test;

import com.robert.util.IPay;
import com.robert.util.Pay;
import com.robert.util.impl.ZfbPay;

/**
 * @author robert
 * @date 2021/5/19 15:20
 */
public class test {

    public static void main(String[] args) {

        //这里模拟的是前端传递的支付宝支付
        IPay zfbPay = new ZfbPay();

        Pay pay = new Pay(zfbPay);

        pay.getPay();
    }

    /**
     * 策略模式的使用是为了减少大量的if-else 结构，对代码进行解耦，在新增支付方式时不需要对之前的代码进行修改，
     * 只需要进行添加支付实现类就可以，前端添加支付方式就可以,这也是java多态的一种体现
     *
     * 这里会有一个问题，如何来判断是使用的哪种支付方式，其实使用的方式还是很多的，比如反射等等，
     * 小编推荐的时Spring框架自带的一种实现方式
     * 代码如下
     *
     */

        //像Spring中注入ApplicationContext对象
     // @Autowired
      //private ApplicationContext applicationContext;
    //type是支付类型，也是需要创建的实现类名称，与@Service("name)要对应
    //@PostMapping("/pay")
//    public Message pay(@RequestParam(value = "type", required = true) String type){
//        Message message = new Message();
//          //所有的支付实现类都需要使用@Service("支付名称，可以自定义")
//        //这里模拟的是前端传递的支付宝支付
//        IPay typePay = applicationContext.getBean(type,IPay.class);
//
          //具体的业务逻辑实现
//        Pay pay = new Pay(typePay);
//        pay.getPay();
//
//        typePay.toPay();
//
//        meesage.setCode("200");
//        return message;
//
//    }

}
