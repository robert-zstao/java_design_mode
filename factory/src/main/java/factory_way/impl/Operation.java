package factory_way.impl;

/**
 *
 * 如果使用工厂模式，普通的创造一个计算器
 * @author robert
 * @date 2021/5/12 13:55
 */

/**
 * 抽象计算类
 */
public abstract class Operation {
    private double one;
    private double two;

    //计算方法
    public abstract double getResult();


    public double getOne() {
        return one;
    }

    public void setOne(double one) {
        this.one = one;
    }

    public double getTwo() {
        return two;
    }

    public void setTwo(double two) {
        this.two = two;
    }

}

//加
class Add extends Operation {

    public double getResult() {
        return getOne()+getTwo();
    }
}

//减
class OperationSub extends Operation {

    public double getResult() {
        return getOne()-getTwo();
    }
}

//乘
class OperationMul extends Operation {

    public double getResult() {
        return getOne()*getTwo();
    }
}


//除
class OperationDiv extends Operation {

    public double getResult() {
        if(getTwo() != 0){

            return getOne()*getTwo();
        }
        throw new IllegalArgumentException("除数不能为0");
    }
}


